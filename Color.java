// Color.java
// Name: Yawen Liu
// Email: yliu2253@wisc.edu
// CS Login: yliu2253
/*
 *      Color class
 */
public class Color {
    private String color;

    // Constructor
    public Color(String iniColor) {
        if (isColorValid(iniColor)) {
            this.color = iniColor;
        } else {
            System.out.println("Failed to initialize the color");
        }
    }

    // Getter
    public String getColor() {
        return this.color;
    }

    /* The method for changing the color
     * TODO: Revise the code so that it returns true only if the 
input color is valid
     *       and different from the existing color before making 
the change.
     */
    public boolean changeColor(String newColor) {
        if (isColorValid(newColor) && 
!newColor.equals(this.color)) {
            this.color = newColor;
            return true;
        }
        return false;
    }

    public boolean isColorValid(String inputColor) {
        String[] validColors = {"red", "orange", "yellow", 
"green", "blue", "indigo", "violet"};
        for (String validColor : validColors) {
            if (inputColor.equals(validColor)) {
                return true;
            }
        }

        // Failed to find a match, the color is invalid
        return false;
    }
}

