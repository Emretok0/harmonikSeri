public class Main {
    public static void main(String[] args) {

        int[] list = {1,4,3,4,5,6};
        double sum =0;
        for (int i: list){
            sum+=1/i;
        }
        System.out.println(list.length/sum);

    }
}
