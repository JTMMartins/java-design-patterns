package BuilderPattern;

public class Window {

    private final int topCornerX;
    private final int topCornerY;
    private final int windowWidth;
    private final int windowHeight;
    private final int fillRedValue;
    private final int fillGreenValue;
    private final int fillBlueValue;
    private final String windowTitle;


    public static final class WindowBuilder {
        private int topCornerX; //if nothing is said, default value will be zero
        private int topCornerY; //if nothing is said, default value will be zero
        // if no values are send to builder, this will be the default values
        private int windowWidth = 300;
        private int windowHeight = 300;
        private int fillRedValue = 255;
        private int fillGreenValue = 255;
        private int fillBlueValue = 255;
        private String windowTitle = "untitled";


        public WindowBuilder withLeftTopcornerPositionX(int topCornerX) {

            //we don't want our X coordinates out of this range
            if (isWithinRange(topCornerX, 0, 1024)) {
                topCornerX = 0;
            }

            this.topCornerX = topCornerX;
            return this;
        }

        public WindowBuilder withLeftTopCornerPositionY(int topCornerY) {

            //we don't want our Y coordinates out of this range
            if (isWithinRange(topCornerY, 0, 800)) {
                topCornerY = 0;
            }

            this.topCornerY = topCornerY;
            return this;
        }

        public WindowBuilder withWidth(int windowWidth) {

            //we don't want our width out of this range
            if (isWithinRange(windowWidth, 1, 600)) {
                windowWidth = 300;
            }

            this.windowWidth = windowWidth;
            return this;
        }

        public WindowBuilder withHeight(int windowHeight) {

            //we don't want our height out of this range
            if (isWithinRange(windowHeight, 1, 600)) {
                windowHeight = 300;
            }

            this.windowHeight = windowHeight;
            return this;
        }

        public WindowBuilder fillWithRGB(int red, int green, int blue) {

            //we don't want any of the RGB values out of the range (0-255)
            if ((isWithinRange(red, 0, 255) | (isWithinRange(green, 0, 255)) | (isWithinRange(blue, 0, 255)))) {

                red = 255;
                green = 255;
                blue = 255;
            }

            this.fillRedValue = red;
            this.fillGreenValue = green;
            this.fillBlueValue = blue;
            return this;

        }

        public WindowBuilder withTitle(String title) {

            if (title != null && !title.equals("")) {
                this.windowTitle = title;
            } else {
                this.windowTitle = " Janela Sem Nome ";
            }
            return this;
        }

        public Window build() {
            return new Window(this);
        }

        /*
         * verifies if a value is out of accepted range
         */
        private boolean isWithinRange(int value, int min, int max) {

            return (value < min || value > max);
        }

    }// end of internal class

    public Window(WindowBuilder builder) {
        this.topCornerX = builder.topCornerX;
        this.topCornerY = builder.topCornerY;
        this.windowHeight = builder.windowHeight;
        this.windowWidth = builder.windowWidth;
        this.fillRedValue = builder.fillRedValue;
        this.fillGreenValue = builder.fillGreenValue;
        this.fillBlueValue = builder.fillBlueValue;
        this.windowTitle = builder.windowTitle;
    }

    @Override
    public String toString() {
        return "I'm creating a window with a name " + windowTitle + " top left X corner = " + topCornerX + " top left Y corner = " + topCornerY + " with a width of " + windowWidth + " and height of " + windowHeight +
                " I will fill the window with the color (" + fillRedValue + "," + fillGreenValue + "," + fillBlueValue + ")";
    }

    public int getTopCornerX() {
        return topCornerX;
    }

    public int getTopCornerY() {
        return topCornerY;
    }

    public int getWindowWidth() {
        return windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public int getFillRedValue() {
        return fillRedValue;
    }

    public int getFillGreenValue() {
        return fillGreenValue;
    }

    public int getFillBlueValue() {
        return fillBlueValue;
    }

    public String getWindowTitle() {
        return windowTitle;
    }
}
