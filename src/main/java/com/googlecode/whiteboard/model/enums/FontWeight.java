/*
* @author  Oleg Varaksin (ovaraksin@googlemail.com)
* $$Id$$
*/

package com.googlecode.whiteboard.model.enums;

/**
 * Enum for font weights "normal" and "bold".
 */
public enum FontWeight
{
    Normal("normal"), Bold("bold");

    private String weight;

    FontWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public static FontWeight getEnum(String weight) {
        for (FontWeight fw : FontWeight.values()) {
            if (fw.weight.equals(weight)) {
                return fw;
            }
        }

        return null;
    }
}