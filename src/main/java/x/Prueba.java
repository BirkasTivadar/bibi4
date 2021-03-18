package x;

public class Prueba {

    public int sum(int number, int... numbers){
        int result = number;
        for(int i : numbers){
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // int result = new Prueba().sum(numbers);   Ilyen esetben nem tudunk csak egy tömöbt átadni
        int result = new Prueba().sum(5, numbers);
        System.out.println(result);
    }
}
