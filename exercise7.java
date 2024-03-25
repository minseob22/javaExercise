public static String exercise7(String str) {

    int firstSpace = str.indexOf(" ");
    if (firstSpace == -1) {
    return str;
    } 
    else {
    return str.substring(0, firstSpace);
    }
    }