package be.ecam.basics.exercises;

import java.util.List;

public class Catalog {
    public static class Product {
        private final String name;
        private final List<String> tags;

        public Product(String name, List<String> tags) {
            this.name = name;
            this.tags = tags;
        }

        public String getName() { return name; }
        public List<String> getTags() { return tags; }
    }

    public static int countTags(Product p) {
        if (p.getTags() == null) { //"| p.getTags().isEmpty())" pourquoi problème? 
            return 0;
        } else {
            return p.getTags().size();
        }
        
    }
}
