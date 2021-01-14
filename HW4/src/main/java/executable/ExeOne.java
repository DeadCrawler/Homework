package executable;

public class ExeOne {
    public String upperString(StringBuilder stringBuilder){
        int j = 65;
        for(char i ; j < 91; j++) {
            i = (char) j;
            if(j!=90){
                stringBuilder.append(i).append(", ");
            } else stringBuilder.append(i);

        }
        return stringBuilder.toString();
    }
    public String lowerString(StringBuilder stringBuilder){
        int j = 97;
        for(char i ; j < 123; j++) {
            i = (char) j;
            if(j!=122){
                stringBuilder.append(i).append(", ");
            } else stringBuilder.append(i);

        }
        return stringBuilder.toString();
    }
    public String rusString(StringBuilder stringBuilder){
        int j = 1072;
        for(char i ; j < 1104; j++) {
            i = (char) j;
            if(j!=1103){
                stringBuilder.append(i).append(", ");
            } else stringBuilder.append(i);

        }
        return stringBuilder.toString();
    }
    public String numString(StringBuilder stringBuilder){
        int j = 48;
        for(char i ; j < 58; j++) {
            i = (char) j;
            if(j!=57){
                stringBuilder.append(i).append(", ");
            } else stringBuilder.append(i);

        }
        return stringBuilder.toString();

    }
    public String valASCII(StringBuilder stringBuilder){

        long j = 0;
        for(char i ; j < 256; j++) {
            i = (char) j;
            if(j!=255){
                stringBuilder.append(i).append(", ");
            } else stringBuilder.append(i);

        }
        return stringBuilder.toString();

    }
}
