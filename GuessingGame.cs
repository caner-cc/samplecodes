using System;

namespace Exercise_GuessingGame
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = "";
            string ans = "";
            int guesses = 0;


            Console.WriteLine("Please guess the name");

          
            do
            {
                name = Console.ReadLine();

                if (name == "Caner" || name == "caner")
                {
                    Console.WriteLine("Correct");
                    guesses++;
                    Console.WriteLine("Your number of guesses: " + guesses);
                    break;

                }
                else
                {
                    Console.WriteLine("Wrong. Would you like to roll again? (y/n)");
                    ans = Console.ReadLine();
                    Console.WriteLine("Please guess the name");
                    guesses++;
                }
                

            } while (ans != "n");



            



        }
    }
}
