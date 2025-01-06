package com.purple.pw_service.util;

public class EmailUtils {
   public static String WELCOME_MSG = "Welcome to Purple Wheel 🎉";

   public static String getWelcomeMessage(String username) {
      return "Hi " + username + ",\n" +
              "\n" +
              "Welcome to Purple Apps! We’re thrilled to have you on board. 🎉\n" +
              "\n" +
              "Here’s what you can do next:\n" +
              "\t• Explore [Feature 1] to get started.\n" +
              "\t• Check out [Feature 2] to enhance your experience.\n" +
              "\t• Connect with our [Support/Community Team] if you have any questions.\n" +
              "\n" +
              "Your journey with us has just begun, and we’re here to help every step of the way. If you need any assistance, feel free to reach out at [support email or link].\n" +
              "\n" +
              "We’re excited to see what you’ll achieve with Purple App! 🚀\n" +
              "\n" +
              "Best regards,\n" +
              "The Purple Team";
   }

}
