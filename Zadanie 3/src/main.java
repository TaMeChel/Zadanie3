public class main {
    public static void main(String[] args){
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++){
            arr[i] = ((int) (Math.random() * 101) - 50);
            System.out.println(arr[i]);


            int x = 0;
            int y = 0;
            int z = 0;
            for (int i = 0; i < arr.length; i++){
                arr[i] = ((int) (Math.random() * 101) - 50);
                if (i < 0){
                    x++;
                } else if (i > 0){
                    y++;
                } else z++;
                System.out.print("Массив имеет" + x + "отрицательных чисел;" + y + "положительных чисел;" + z + "нулей.");
            }
        }
    }
}