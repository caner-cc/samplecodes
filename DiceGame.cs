using System;
using System.Linq;

namespace Exercise_Arrays3
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] diced;
            diced = new int[5];
            Random random = new Random();
            int number;


            for (int i = 0; i < diced.Length; i++)
            {
                number = random.Next(1, 6);

                if (!diced.Contains(number))
                {
                    diced[i] = number;
                }
                else
                {
                    i--;
                }
                
            }
            for (int i = 0; i < diced.Length; i++)
            {
                Console.WriteLine(diced[i]);
            }

            
                
            
            

        }
    }
}
