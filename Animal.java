package xxx;

public class Animal {
    private int age;
	private float weight;
	
	public Animal(){
	//留著無參數的建構子;
	//1.增加繼承設計上的彈性
	//2.給工具,框架呼叫使用(最主要原因)	
	}
    
    public Animal (int age, float weight) {
    	this.age = age;
    	this.weight = weight;
    }
    
//    public void speak() {
//    	System.out.println(age);
//    	System.out.println(weight);
//    }
    
    public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void speak() {
		System.out.println("age = " + age);
		System.out.println("weight = " +weight);
	}
}
