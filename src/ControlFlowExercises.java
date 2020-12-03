public class ControlFlowExercises {
    public static void main(String[] args) {
//     1.a Outputs 5-15 using a while loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%d ",i);
//            i++;
//        }


//      1.b will count by 2's up to 100.
//        int a = 2;
//        do {
//            System.out.println(a);
//            a = a + 2;
//        } while (a <= 100);


//          counts backwards from 100 by 5's
//        int num = 100;
//        do{
//            System.out.println(num);
//            num = num - 5;
//        }while (num >= -10);

//        will output 2 squared up to 1,000,000.
//            long toBeSquared = 2L;
//            do{
//                System.out.println(toBeSquared);
//                toBeSquared *= toBeSquared;
//            }while(toBeSquared <= 1000000);

//        Refactor previous exercises to use a for loop.






//        Using for loop to refactor 1.a and 1.b


//        for(int i = 5; i <=15; i++){
//            System.out.printf("%d ",i);
//        }

        for(int a = 2; a <= 100;){
            System.out.println(a);
            a += 2;
        }


    }
}

