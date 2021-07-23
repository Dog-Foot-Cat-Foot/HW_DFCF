package day0727.ch12;

public class Ex01_GenericPrinterTest {

	public static void main(String[] args) {
		
		//------------------------------------------
		// <1> GenericPrinter<Powder>형 powderPrinter 변수 선언,
		//	Powder형으로 GenericPrinter 인스턴스를 생성하여 메위주를 리턴한다.
		//	GenericPrinter<Powder> : 제네릭 자료형(Generic type), 매개변수화된 자료형(parameterized type)
		//	Powder : 대입된 자료형
		// <2> powderPrinter 변수로 setMaterial() 메서드 호출하며
		//	Powder 인스턴스를 생성하여, 생성한 메위주를 매개변수로 넘겨준다.
		// <3> Powder형 powder 변수 선언, powderPrinter 변수로 getMaterial() 메서드 호출하여 Powder형 데이터를 리턴받음
		// <4> powderPrinter.toString() 메서드 호출하여 출력, 재료는 Powder입니다.
		//------------------------------------------
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();	// <1>
		
		powderPrinter.setMaterial(new Powder());			// <2>
		Powder powder = powderPrinter.getMaterial();		// <3>
		System.out.println(powderPrinter);					// <4>
		
		//------------------------------------------
		// <1> GenericPrinter<Plastic>형으로 plasticPrinter 변수 선언,
		//	Plastic형으로 GenericPrinter 인스턴스를 생성하여 메위주를 리턴한다.
		//	GenericPrinter<Plastic> : 제네릭 자료형(Generic type), 매개변수화된 자료형(parameterized type)
		//	Plastic : 대입된 자료형 
		// <2> powderPrinter 변수로 setMaterial() 메서드 호출하며
		//	Plastic 인스턴스를 생성하여, 생성한 메위주를 매개변수로 넘겨준다.
		// <3> Plastic형 plastic 변수 선언, plasticPrinter 변수로 getMaterial() 메서드 호출하여 Plastic형 데이터를 리턴받음
		// <4> plasticPrinter.toString() 메서드 호출하여 출력, 재료는 Plastic입니다.
		//------------------------------------------
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();	// <1>
		
		plasticPrinter.setMaterial(new Plastic());			// <2>
		Plastic plastic = plasticPrinter.getMaterial();		// <3>
		System.out.println(plasticPrinter);					// <4>
		
		//------------------------------------------
		// <1> powderPrinter 변수로 printing() 메서드 호출, Powder 재료로 출력합니다.
		// <2> plasticPrinter 변수로 printing() 메서드 호출, Plastic 재료로 출력합니다.
		//------------------------------------------
		powderPrinter.printing();			// <1>
		plasticPrinter.printing();			// <2>
		
	}

}
