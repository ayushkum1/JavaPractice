class CommandLine{
	public static void main(String args[]){
		
		//checking if the arguments exists or not
		if(args.length<1){
			System.out.println("Error: No arguments given");
		}
		//checking if the argument is not more than 1 as we need only one name
		else if(args.length>1){
			System.out.println("Error: Only one argument required");
		}
		else{
			System.out.println("Hello "+ args[0]);
		}
	}
}
