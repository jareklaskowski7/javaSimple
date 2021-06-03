//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 56; Implementing Iterable

public class JavaSimple56ImplementingIterable {
    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();

        /*
         * for (String url: urlLibrary) { System.out.println(url); }
         */

        for (String html : urlLibrary) {
            System.out.println(html.length());
            System.out.println(html);
        }
    }
}
