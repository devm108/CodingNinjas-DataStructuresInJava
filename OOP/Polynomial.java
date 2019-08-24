package classes_and_objects;

public class Polynomial {
	private int[] coefficient;
	   
	public Polynomial() {
        coefficient = new int[5];
    }
	
	
	
    public void restructure()
    {
        int[] temp = new int[coefficient.length*2];
        for(int i=0;i<coefficient.length;i++)
            temp[i]=coefficient[i];
        coefficient=temp;
    }

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
        
        while(true)
        {
            if(degree<coefficient.length)
                break;
            restructure();
        }
        
        coefficient[degree] = coeff;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        for(int i=0;i<coefficient.length;i++)
        {
            if(coefficient[i]!=0)
            System.out.print(coefficient[i]+"x"+i+" ");
        }
	}

	
    public int get(int degree)
    {
        if(degree<coefficient.length)
            return coefficient[degree];
        
        return 0;
    }
    
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
        int max = Math.max(this.coefficient.length,p.coefficient.length);
        for(int i=0;i<max;i++)
        {
            int sum = this.get(i)+ p.get(i);
            result.setCoefficient(i,sum);
        }
        return result;
    }

		
	
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial result = new Polynomial();
        int max = Math.max(this.coefficient.length,p.coefficient.length);
        for(int i=0;i<max;i++)
        {
            int dif = this.get(i) - p.get(i);
            result.setCoefficient(i,dif);
        }
        return result;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();
        for(int i=0;i<this.coefficient.length;i++)
        {
            if(this.get(i)==0)
                continue;
            for(int j=0;j<p.coefficient.length;j++)
            {
                int oldCoefficient = result.get(i+j);
                result.setCoefficient(i+j,oldCoefficient+this.get(i)*p.get(j));
            }
        }
        return result;
        
	}

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

	


