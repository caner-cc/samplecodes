using System;

namespace Exam_1
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] array1;
            array1 = new string[6];
            
    

            for (int i = 0; i < array1.Length; i++)
            {
                Console.WriteLine("Type the " + (i+1) +". planet");
                array1[i] = Console.ReadLine();
                
            }            
            Console.WriteLine("");
            Console.Write("The planets in alphabetical order. ");                       
            Array.Sort(array1);

            for (int i = 0; i < array1.Length; i++)
            {
                Console.WriteLine(array1[i]);
            }
            
            Console.WriteLine("How many?");
            int loopCount = int.Parse(Console.ReadLine());

            //Because of the loopCount it will stop printing at that number that was put in.
            for (int i = 0; i < loopCount; i++)
            {
                Console.WriteLine(array1[i]);
            }
            

            
        }   

    }
}
