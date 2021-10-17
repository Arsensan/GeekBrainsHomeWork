public class Main {
    public static void main(String[] args) {
     //methodOneException(new String[4][4]);
     methodTwoException(new String[4][4]);
    }

    static String[][] arrayMethod() {
        String[][] a = {
                {"2", "11", "5", "8"},
                {"4", "3", "2", "2"},
                {"11", "3", "5", "34"},
                {"14", "2", "3F", "51"}
        };
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {

                sum += Integer.parseInt(a[i][j]);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

        return a;
    }

    static String[][] methodOneException(String[][] arr) throws MyArraySizeException {

        try {
            return arrayMethod();

        } catch (
                ArrayIndexOutOfBoundsException e) {
            throw new MyArraySizeException("Массив вышел за границы", e);
        }
    }
    static String [][] methodTwoException(String[][] arr2) throws MyArrayDataException {
    try{
        return arrayMethod();
    }catch( IllegalArgumentException e){
        throw new MyArrayDataException( "Неверный формат строки " + e);
    }
}
}








