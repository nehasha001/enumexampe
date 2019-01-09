package enumexampe;
public enum EnumExample {
        EAST("E"),
        WEST("W"),
        NORTH("N"),
        SOUTH("S");
        private final String shortCode;
        EnumExample(String code) {
            this.shortCode = code;
        }
        public String getDirectionCode(){
            return this.shortCode;


    }
public static void main(String[] args) {
    EnumExample dir = EnumExample.NORTH;
    switch (dir) {
        case EAST:
            break;
        case WEST:
            break;
        case NORTH: {


        }
        case SOUTH:
    }
}}