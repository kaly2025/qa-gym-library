
package br.edu.ifrn.qagym.util;

public class TextNormalizer {

    public String normalize(String text) {
        if (text == null) {
            return "";
        }
        return text.trim().toLowerCase();
    }

    public boolean containsIgnoreCase(String text, String search) {
       
        if (text == null || search == null) {
            return false;
        }
        String normalizedText = normalize(text);
        String normalizedSearch = normalize(search);
        return normalizedText.contains(normalizedSearch);
    }
}
