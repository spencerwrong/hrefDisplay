import java.util.*;

public class NumCounter
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,4,223,5,6,46,57,4,4,3,6,6,6,88,00,55,5,4,34,654,3, 1, 3, 4, 1, 5, 3, 4));
        ArrayList<Integer> arr2 = new ArrayList<Integer>();     
        ArrayList<Integer> arr3 = new ArrayList<Integer>(Arrays.asList(2));
        countNums(arr1);
        countNums(arr2);
        countNums(arr3);
           
    }

    public static void countNums(ArrayList<Integer> arr)
    {

        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> counts = new ArrayList<Integer>();

        if(arr.size() > 0)
        {
            for(int i = 0; i < arr.size(); i++)
            {
                int currentNum = arr.get(i);
                if(!nums.contains(currentNum)) // doesnt contain
                {
                    nums.add(currentNum);
                    counts.add(1);
                }
                else
                {
                    for(int j = 0; j < counts.size(); j++)
                    {
                        int k = j + 1;
                        if(currentNum == nums.get(j))
                        {
                            counts.set(j, counts.get(j) + 1);
                        }
                    }
                }
            }
            System.out.println("arr:    " + arr.toString());
            System.out.println("nums:   " + nums.toString());
            System.out.println("counts: " + counts.toString());
        }
        else
        {
             System.out.println("ArrayList size 0!");   
        }
    }
}