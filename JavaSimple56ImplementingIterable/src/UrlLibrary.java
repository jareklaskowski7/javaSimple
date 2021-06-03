//  Cave of Programming
//  Java for Complete Beginners
//  Java Simple 56; Implementing Iterable

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> {
        private int index = 0;

        public boolean hasNext() {
            return index < urls.size();
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        url.openStream()));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            index++;
            return sb.toString();
        }

        public void remove() {
            urls.remove();
        }
    }

    public UrlLibrary() {
        urls.add("http://www.caveofprogramming.com");
        urls.add("http://www.facebook.com/caveofprogramming");
        urls.add("http://news.bbc.co.uk");
    }

    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*
     * @Override public Iterator iterator() { return urls.iterator(); }
     */
}
