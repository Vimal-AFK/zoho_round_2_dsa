import static solutions.array_rotation.array_rotation;
import static solutions.reverse_array.reverse_array;
import static solutions.second_largest.second_largest;
import static solutions.selection_sort.selection_sort;
import static solutions.sum_of_elements_based_on_occurance.sum_of_elements_based_on_occurance_method_1;
import static solutions.sum_of_elements_based_on_occurance.sum_of_elements_based_on_occurance_method_2;
import static solutions.third_largest.third_largest;


public class main {
    public static void main(String[] args) {
        //this is main fun
        int[] input = { 5,2,6,4,10 };
        reverse_array(input,2,4);
        for(int x : input) {
            System.out.print(x + " ");
        }
    }
}
