package com.kodilla.patterns.bigmac;

import com.kodilla.patterns.bigmac.bun.Bun;
import com.kodilla.patterns.bigmac.sauce.Souce;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private Bun bun;
    private int burgers;
    private Souce sauce;
    private List<String> ingredients;

    private Bigmac (final Bun bun, final int burgers, final Souce sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {

        private Bun bun;
        private int burgers;
        private Souce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun (Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce (Souce sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredients (String ingredient ) {
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            return new Bigmac(bun, burgers,sauce, ingredients);
        }
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
