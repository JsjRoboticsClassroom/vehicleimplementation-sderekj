package nyc.c4q.dereksantos;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        twitterMentions("@c4q #rocks #code #tech stuff goes here");
//        twitterMentionsArray("@c4q #rocks #code #tech stuff goes here");

    }

    public static void twitterMentionsArray(String tweet) {

        String[] words = tweet.split(" ");
        String mentions = "Mentions: ";
        String hashtags = "Hashtags: ";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == '#') {
                hashtags += word + " ";
            } else if (word.charAt(0) == '@') {
                mentions += word + " ";
            } else {
                continue; // do nothing
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);

    }

    public static void twitterMentions(String tweet) {

        String mentions = "These are the mentions: ";
        String hashtags = "These are the hashtags: ";


        for (int i = 0; i < tweet.length(); i++) {
            char c = tweet.charAt(i);
            switch (c) {
                case '@':
                    while (c != ' ' && i < tweet.length()) {
                        mentions += tweet.charAt(i);
                        i++;
                        if (tweet.charAt(i) == ' ') {
                            break;
                        }
                    }
                    break;
                case '#':
                    while (c != ' ' && i < tweet.length()) {
                        hashtags += tweet.charAt(i);
                        i++;
                        if (tweet.charAt(i) == ' ') {
                            break;
                        }
                    }
                    break;
                default: //fixme
            }
        }
        System.out.println(mentions);
        System.out.println(hashtags);
    }
}
