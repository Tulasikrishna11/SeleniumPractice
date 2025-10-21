//package test1;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import javax.net.ssl.*;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.security.cert.X509Certificate;
//import java.util.List;
//
//public class LinkChecker {
//
//    // Trust all SSL certificates (for testing only)
//    private void trustAllCertificates() throws Exception {
//        TrustManager[] trustAllCerts = new TrustManager[]{
//            new X509TrustManager() {
//                public X509Certificate[] getAcceptedIssuers() { return null; }
//                public void checkClientTrusted(X509Certificate[] certs, String authType) {}
//                public void checkServerTrusted(X509Certificate[] certs, String authType) {}
//            }
//        };
//
//        SSLContext sc = SSLContext.getInstance("SSL");
//        sc.init(null, trustAllCerts, new java.security.SecureRandom());
//        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
//        HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
//    }
//
//    @Test
//    public void linkChecker() {
//        try {
//            trustAllCertificates(); // Bypass SSL validation for testing
//        } catch (Exception e) {
//            System.out.println("Failed to set SSL trust: " + e.getMessage());
//            return;
//        }
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Total links found: " + links.size());
//
//        int workingLinks = 0;
//        int brokenLinks = 0;
//
//        for (WebElement link : links) {
//            String url = link.getAttribute("href");
//            if (url == null || url.isEmpty()) {
//                continue;
//            }
//
//            try {
//                URL linkUrl = new URL(url);
//                HttpURLConnection connection;
//
//                if (url.startsWith("https")) {
//                    connection = (HttpsURLConnection) linkUrl.openConnection();
//                } else {
//                    connection = (HttpURLConnection) linkUrl.openConnection();
//                }
//
//                connection.setRequestMethod("HEAD");
//                connection.setConnectTimeout(10000); // 5 seconds
//                connection.setReadTimeout(10000);
//                connection.connect();
//
//                int responseCode = connection.getResponseCode();
//                if (responseCode >= 200 && responseCode < 400) {
//                    System.out.println("✅ Working: " + url);
//                    workingLinks++;
//                } else {
//                    System.out.println("❌ Broken: " + url + " (Code: " + responseCode + ")");
//                    brokenLinks++;
//                }
//
//            } catch (Exception e) {
//                System.out.println("❌ Exception for URL: " + url + " → " + e.getMessage());
//                brokenLinks++;
//            }
//        }
//
//        System.out.println("\nSummary:");
//        System.out.println("Working links: " + workingLinks);
//        System.out.println("Broken links: " + brokenLinks);
//
//        driver.quit();
//    }
//}
