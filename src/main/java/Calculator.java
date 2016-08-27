/**
 * Created by Администратор on 08.08.16.
 */
class Calculator {


        private int result;

        /*Initiate Calculator with 0 in result*/
        public Calculator(){
            this.result =0;
        }

        /*Sum of two integer arguments saved in result variable*/
        private void add(int firstArg, int secondArg){
            this.result= firstArg+secondArg;
        }
        /*Difference betwenn first and second integer arguments saved in result variable*/
        private void subtract(int firstArg, int secondArg){
            this.result= firstArg-secondArg;
        }
        /*Product of two integer arguments saved in result variable*/
        private void multiply(int firstArg, int secondArg){
            this.result= firstArg*secondArg;
        }
        /*Quotient of first integer argument divided by second integer argument saved in result variable*/
        private void divide(int firstArg, int secondArg){
            this.result= firstArg/secondArg;
        }

        /*
          Select needed operation based on String parameter and execute chosen one.
          Available operations are Add, Subtract, Division, Multiply.
          Wrong  parameter causes system.out message, result saved from previous operation
        */
        void calculate(int firstArg, int secondArg, char operation){
            switch(operation){
                case '+':	add(firstArg, secondArg);
                    break;
                case '-':	subtract(firstArg, secondArg);
                    break;
                case '*':	multiply(firstArg, secondArg);
                    break;
                case '/':	if(secondArg==0)
                    System.out.println("You shoudn\'t divide by zero!");
                else
                    divide(firstArg, secondArg);
                    break;
                default: 	System.out.println("Chosen operation is not valid");
            }
        }

 /*Retrive the result*/

        public int getResult(){
            return this.result;
        }


        /*Erase the result from previous calculations back to zero*/
        public void cleanResult(){
            this.result = 0;
        }

    }
