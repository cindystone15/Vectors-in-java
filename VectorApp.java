import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


public class VectorApp
{
    public static void main(String[] args)
    {

        System.out.println("Please enter a number of vectors: ");
        

    }

}

/*
Write a program asking for some number of vectors (in the mathematical sense) - given as an argument. 
The end of the vector is marked by enter key. 
If any of the given elements is not a number, it is ignored.
Then try to add vectors, if their lengths are equal. Example of user input:
A,5,8 - length is 2
1,9,10a,11 - length is 3
2,3,5,6,$% - length is 4
If not, cast DifferentVectorsLengthsException (you have to write this exception), with which you can specify and later read the length of the vectors. If vectors were equal, the result of the addition is written to the file. If the vectors aren't equal, the user is prompted to re-enter the vectors. If the vectors weren't equal, you should be able to formulate each of the example sentences without changing your code nothing more than catch clause:
(first, second, ..., last) the vector length is XX.
(first, second, ..., last) the vector length is (lower/bigger) than (first, second, ..., last) vector length.
The tutor will give the exact sentence to display.
Finally, if vectors weren't equal, the user is prompted to re-enter the vectors.
*/
