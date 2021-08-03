1. 자바스크립트 선언문
```java

▶ 선언문은 자바스크립트 코드를 작성할 영역을 선언하는 것이라고 이해하면 된다.
   <script> 작성할 영역 </script> 태그로 종료된 곳까지 스크립트 영역이라고 부른다

▶ 선언문은 <head> 태그 영역 또는 <body> 태그 안에 사용한다
    우리나라는 head 태그 안에 대부분 사용한다 
```

2. document , write
```java

▶ document 는 문서 객체이며 문서 출력 메서드인 write() 를 이용하여 데이터를 문서에 출력할 때 사용한다.
```

3. 주석
```java
▶ 자바스크립트 선언문 안에서 주석을 넣고 싶을때는 // (한줄글)   /* 여러줄 */ 형식으로 사용한다

```

4. 40p 논리형 테스트 
```java
        var a =true;  // 변수 a 값에 true 값 지정
        var b =false; // 변수 b 값에 true 값 지정
        var c =10 >5; // 변수 c 값에 true 값 지정
        var d = Boolean(null); // 변수 d 값에 true 값 지정

        document.write(a,"<br>");
        document.write(b,"<br>");
        document.write(c,"<br>");
        document.write(d,"<br>");


```

5. 41p typeof 형 
```java
// typeof 형을 이용하여 변수에 저장된 자료형을 알아내는 예제이다.
 var a =true;
        var b =false;
        var c =10 >5;
        var d = Boolean(null);

        document.write(typeof a,"<br>");
        document.write(typeof b,"<br>");

```

6. 연산자
```java
      var num1 = 15;
      var num2 = 2;
      var result;
      result = num1 + num2;
      document.write(result,"<br>");

      result = num1 - num2;
      document.write(result,"<br>");

      result = num1 * num2;
      document.write(result,"<br>");

      result = num1 / num2;
      document.write(result,"<br>");

```

7. 문자결합 연산자
```java
// 각각 변수에 문자와 숫자 데이터를 넣고 하나의 문자 데이터로 결합하는 예제이다
var t1 = "학교종이";
     var t2 = "떙땡땡";
     var t3 = "8282";
     var t4 = "모이자";

     var result = t1 + t2 + t3 + t4;
     document.write(result);

```

8. 논리 연산자 
```java
 var a=10;
   var b=20;
   var m=30;
   var n=40;
 
   var result;
   result= a>b || b>=m || m>n;     // false || false || false 
   document.write(result,"<br />");  // false
 
   result= a>b || b>=m || m<=n;   // false || false || true
   document.write(result,"<br />"); // true
 
   result= a<=b && b>=m && m<=n; // true && false && true
   document.write(result,"<br />"); // false
 
   result= a<=b && b<=m && m<=n; // true && true && true
   document.write(result,"<br />"); // true
 
   result= !(a>b);  // !false
   document.write(result,"<br />"); // true

```

9. 삼항 연산자
```java
  var a = 10;
	var b = 3;

	var result = a > b ? "javascript" : "hello";   // a가 b보다 크고 값이 true면  javascript  출력 // false면 hello 문구출력
	document.write(result); //jvaascript

```

10. prompt() 메서드 기본 사용법과 예제 대입
```java
// prompt() 메서드는 페이지를 방문한 방문자가 질의응답 창을 만들어서 보여주는 형식이다.

    var name = prompt("당신의 이름은?", "");
	var height = prompt("당신의 신장은?", "0");
	var weight = prompt("당신의 몸무게는?", "0");
	
	var normal_w = (height - 100) * 0.9; // 비만도 변수
	var result = weight >= normal_w - 5 && weight <= normal_w + 5;  // 비만도 값에 +-5 해서 한다
	result = result ? "적정 체중입니다." : "적정 체중이 아닙니다."; //  true면 적정 체중입니다 / false면 적정 체중이 아닙니다 
	document.write(name +"님은 "+ result); // 문구 출력

```


11. prompt() 메서드 기본 사용법과 조건문 예제
```java
 var id = "easy1004";
	var pw = "112233";

	var user_id = prompt("아이디는?","");
	var user_pw = prompt("비밀번호는?","");

	if(id == user_id) {
		if(pw == user_pw) {
				document.write(user_id+"님 반갑습니다!");
		} else {
				alert("비밀번호가 일치하지 않습니다.");
				location.reload(); 
                //reload() 메소드는 현재 문서를 새로고침할 때 사용한다. 
                //reload() 메소드는 사용하고 있는 브라우저의 새로고침 버튼과 동일하게 동작한다. 
                // 서버로부터 페이지를 다시 받아올 수 있다.
		}
	} else {
		alert("아이디가 일치하지 않습니다.");
		location.reload();
	}

```

12. 자바스크립트 객체
```java
▶ 자바스크립트는 객체 기반 언어이다. 
    객체는 기능과 속성을 가지고 있다.

ex) 티비를 기준으로 보자

 ▶티비의 메서드를 본다면 // 메서드는 행위
        1. 켜다();
        2. 끄다();
        3. 볼륨을 높이다();
        4. 볼륨을 줄이다();

 ▶티비의 속성 변수를 본다면 // 속성변수는 객체의 값
        1. 너비;
        2. 높이;
        3. 색상;
        4. 무게;

 ▶자바스크립트 객체의 메서드와 속성을 사용하는 기본형은 다음과 같다
        1. 객체.메서드();
        2. 객체.속성; 또는 3. 객체.속성=값;

        1. 객체 메서드를 실행한다.
        2. 객체의 속성값을 가져온다.
        3. 객체의 속성값을 바꿉니다.

```

13. 객체의 종류
```java

자바스크립의 객체는 크게 내장 객체, 브라우저 객체 모델(Bom) , 문서 객체 모델(DOM) 객체들이 있다.

▶ 내장 객체
    - 자바스크립트 엔진이 내장되어 있어 필요한 경우 생성해서 사용할 수 있다.
      내장 객체로는 문자(String), 날짜(Date), 배열(Array), 수학(Math) 등이 있다.

▶ 브라우저 객체 모델 Bom
    - 브라우저에 계층 구조로 내장되어 있는 객체를 말한다.
        window, screen, location, history, navigator 객체 등이 있으며
        브라우저(window)는 document 와 location 객체의 상위 객체이다.

    - 예를 들어 자바스크립트를 이용해 현재 열려 있는 사이트에서 다른 사이트로 이동하려면 location 객체에 참조 주소(href)
      속성을 바꾸면 된다. window.location.href ="사이트 URL"
```

14. 내장 객체 생성하고 예제 만들어보기
```java
 var tv = new Object( ); // new 키워드와 기본 객체 생성함수 Object() 이용해 객체 생성
	tv.color = "white";
	tv.price = 300000;
	tv.info = function( ) {
		document.write("tv 색상: " + this.color, "<br>"); // this 는 tv 변수안의 color 속성변수를 참조해서 출력
		document.write("tv 가격: " + this.price, "<br>"); // this 는 tv 변수안의 price 속성변수를 참조해서 출력
	}

	var car = { 
		color: "black",
		price: 5000000,
		info: function( ) {
			document.write("car 색상: " + this.color, "<br>");  // this 는 car 변수안의 color 속성변수를 참조해서 출력
			document.write("car 가격: " + this.price, "<br>");  // this 는 car 변수안의 price 속성변수를 참조해서 출력
		} 
	}; 

	document.write("<h1>tv 객체 메서드 호출</h1>");
	tv.info(); 
	document.write("<h1>car 객체 메서드 호출</h1>");
	car.info();

```

15. 날짜 정보 객체와 메서드
```java
var today = new Date( );
	var nowMonth = today.getMonth()+1; // 자바스크립트는 0월~11월 이므로 +1 을 해준다
					nowDate = today.getDate( ),
					nowDay = today.getDay( );
	
	document.write("<h1>오늘 날짜 정보</h1>");
	document.write("현재 월: " + nowMonth, "<br>");
	document.write("현재 일: " + nowDate, "<br>");
	document.write("현재 요일:" + nowDay, "<br>");
	
	var worldcup = new Date(2002, 4, 31);
	var theMonth = worldcup.getMonth( )+1,
					theDate = worldcup.getDate( ),
					theDay = worldcup.getDay( );
	
	document.write("<h1>월드컵 날짜 정보</h1>");
	document.write("2002월드컵 몇 월: " + theMonth, "<br>");
	document.write("2002월드컵 몇 일: " + theDate, "<br>");
	document.write("2002월드컵 무슨 요일: " + theDay, "<br>");

```

16. 수학 객체와 메서드 사용
```java
 var num = 2.1234;

    var maxNum = Math.max(10, 5, 8, 30), // maxNum 변수 선언  Math 객체의 [최대값] 구하는 max 메서드
    minNum = Math.min(10, 5, 8, 30), // minNum 변수 선언  Math 객체의 [최소값] 구하는 min 메서드
    roundNum = Math.round(num), // roundNum 변수 선언  Math 객체의 [소수점 첫째 자리 반올림 구하는] round 메서드
    floorNum = Math.floor(num), // floorNum 변수 선언  Math 객체의 [소수 첫째 자리 내림] 구하는 floor 메서드
    ceilNum = Math.ceil(num), // ceilNum 변수 선언  Math 객체의 [소수 첫째 자리 올림] 구하는 ceil 메서드
    rndNum = Math.random( ), // rndNum 변수 선언  Math 객체의 [0과 1의 난수] 구하는 random 메서드
    piNum = Math.PI; // piNum 변수 선언  Math 객체의 [원주율상수반환] 구하는 PI 메서드

    // 출력
    document.write(maxNum, "<br>");
    document.write(minNum, "<br>");
    document.write(roundNum, "<br>");
    document.write(floorNum, "<br>");
    document.write(ceilNum, "<br>");
    document.write(rndNum, "<br>");
    document.write(piNum, "<br>");  

    // Math.random( )을 이요하여 0부터 10까지 난수를 구하기
        - Math.random( )*10; 하면 0~10 실수로 난수

    // Math.floor(Math.random()*11);
        - 0~10까지 난수를 발생하여 소수점 값을 제거하고 출력

    // Math.floor(Math.random()*31)+120;
        - 0부터 30까지 정수로 난수를 발생하고 , 120부터 150까지 난수를 발생

```

17. 수학 객체와 메서드 사용 2 
```java
document.write("<h1>컴퓨터 가위, 바위, 보 맞추기</h1>");

        var game = prompt("가위, 바위, 보 중 선택하세요?", "가위");
        var gameNum;
        switch(game) { // 가위바위보 각각에 해당하는 값을 넣기
            case "가위": gameNum = 1;
            break;
            case "바위": gameNum = 2;
            break;
            case "보": gameNum = 3;
            break;
            default: alert("잘못 작성하셨습니다.");
            location.reload();
        }

        var com = Math.ceil( Math.random() * 3 ); // com 변수선언 

        document.write("1=가위 2=바위 3=보"+"    " + "결과값:"  +  "       "+com);

        if(gameNum == com) { // 난수와 가위바위보 값이 같으면 맞춘다는 이미지 출력
            document.write("    성공");
        } else { // 난수와 가위바위보 값이 다르면 틀렸다는 이미지 출력
            document.write("    실패");

```

18. 배열 객체 
```java
var arr = [30,"따르릉",true];

        document.write("<h3>배열값 가져오기-1</h3>");
        document.write(arr[0],"<br>");
        document.write(arr[1],"<br>");
        document.write(arr[2],"<br>");

        document.write("<h3>배열값 가져오기-2</h3>");
        for(var i =0; i<arr.length ; i++)
        {
            document.write(arr[i],"<br>");
        }

```

19. 배열 객체 - 2 
```java
var arr_1 = ["사당", "교대", "방배", "강남"];
		var arr_2 = ["신사", "압구정", "옥수"];

		var result = arr_1.join("-"); // 배열객체속에 각각의 인덱스에 - 연결하여 하나의 문자열로! 출력
		console.log(result);

		result = arr_1.concat(arr_2); // concat 2개의 배열을 하나의 배열로 만든다 
		console.log(result);

		result = arr_1.slice(1, 3); // slice 1~ 2 
		console.log(result);

		arr_1.sort( ); // 배열 오름차순 정렬 출력
		console.log(arr_1);

		arr_2.reverse( ); // 배열 순서를 거꾸로 뒤집는다
		console.log(arr_2);

```

20. 함수 
```java

▶ 기본 함수 정의문
    - 함수를 사용하여 코드를 저장한 것을 '함수 정의문'라고 한다.
    - 변수를 선언할 때 var 를 사용한 것처럼 함수에서는 function 키워드를 사용해 변수를 선언한다.

    - 기본형
    function 함수명(){
        자바스크립트 코드;
    }

    - 다음과 같이 익명함수(함수명이 없는 함수)를 선언하고 변수에 참조해도 된다.
    참조변수 = function(){
        자바스크립트코드;
    }

    // 함수 정의문과 익명 함수를 변수에 참조한 예

    var count = 0;

	myFnc(); // 함수 호출문이 먼저 나와도 호이스팅 방식이 적용되어 정상적으로 호출이 된다.
	
	function myFnc() {
		count++;
		document.write("hello" + count,"<br>");
	}        
	
	myFnc();
	
	var theFnc = function() {
		count++;
		document.write("bye" + count,"<br>");
	}
	
	theFnc();

// 출력 hello1 
        hello2
        bye3
```

21. 함수 정의문을 이용해 배경색 바꾸기 버튼을 클릭할 때마다 배경색이 바뀌도록 변화
```java
<html>
<meta charset = "UTF-8">
<head> 
	<title> </title>

    //실행하면 흰색~보라색 순으로 바뀐다
    <script>
      var color=["white", "yellow", "aqua", "purple"];
			
			var i=0;
			function changeColor() {
				i++;
				if(i >= color.length) { //i의 값이 4 이상이면 0으로 바꿔준다
					i = 0;
				}
				
				var bodyTag = document.getElementById("theBody"); //getElementById 메서드는 id 값을 이용해 문서 객체(태그)를 선택하는 메서드
				bodyTag.style.backgroundColor = color[i];
                //문서객체.style.스타일속성= 값;
			}


    </script>
</head>

<body id="theBody">
	<button onclick="changeColor();">배경색 바꾸기 </button> // 버튼을 클릭하면 changeColor() 함수를 호출한다
</body>

</html>

```

22. 매개변수가 있는 함수 정의문 
```java

function 함수명(매개변수1, 매개변수2, ...매개변수n){
    자바스크립트코드;
}

함수명(데이터1, 데이터2, ...데이터n);

function test1(name,area){  /// 매개변수가 있는 함수 정의문
			document.write("안녕하세요"+ name + "입니다." ,"<br>");
			document.write("사는 곳은"+ area + "입니다." ,"<br>");
		}

		test1("장지언","서울");

		test1("장지언2","경기");
```

23. 매개변수가 있는 함수 정의문 2  - 로그인하기   
```java
var user_id = "jang"; // 로그인 시 맞는 아이디 값
		var user_pwd = "1234"; // 로그인 시 맞는 비밀번호 값

		function login(id,pw){ // 로그인 함수 선언 매개변수로 id,pwd
			if(id == user_id){
				if(pw==user_pwd){
					document.write(id +"님의 방문을 환영합니다.");

				}else{
					alert("잘못된 비밀번호입니다.");
				}

			}else{
				alert("존재하지 않는 아이디입니다.");
			}
		}

		var rightid = prompt("아이디를 입력하세요"); // 질의 응답 prompt 메서드 사용하여 아이디 입력하라고 문구 출력
		var rightpwd = prompt("비밀번호를 입력하세요"); // 질의 응답 prompt 메서드 사용하여 비밀번호 입력하라고 문구 출력

		login(rightid,rightpwd); // 함수의 매개변수값에 질의 응답에 했던 아이디와 비밀번호 값을 넣어주고 함수에서 비교하여 로그인 여부 실행

```

24. 함수에서 return 문의 역할   
```java
- return 문은 함수에서 결과 값을 반환할 때 사용한다.
    - 그리고 함수에서 return 문이 실행되면 반복문의 break 문과 비슷하게 코드가 강제로 종료된다.
    - 다시 말해 함수 정의문에 return 문이 사용되면 함수를 호출했을 때 결과값(data)을 반환한다.

    function 함수명(){
        자바스크립트 코드 1;
        return;

        자바스크립트 코드 2; // 코드 2보다 먼저 return이 들어갔기에 함수 종료하고 자바스크립트코드 1에서 실행했던 결과값을 반환
    }

// 과목 2개를 받아 평균 점수를 구하는 매개변수가 함수
function testAvg(arrData){
		var sum = 0;    
		for(var i = 0; i < arrData.length; i++) {
			sum += Number(prompt(arrData[i] + " 점수는?", "0")); // 값을 number로 감싸 정수를 표현
		}

		var avg = sum / arrData.length;
		return avg;
		}

		var arrSubject = ["국어", "수학"];
		var result = testAvg(arrSubject); // 매개변수 값에 국어 수학값을 넣는다

		document.write("평균 점수는 " + result + "점 입니다");


```

25. 함수 스코프의 개념 이해
```java
▶ 함수 스코프란?
 - 사전적 의미는 범위.
 - 함수의 유효범위

▶ 전역 변수와 지역 변수의 개념차이

var 변수명;   //전역변수

function 함수명(){
    var 변수명; // 지역변수
}

▶ 전역 함수와 지역 함수의 개념차이

function 함수명1(){ // 전역함수
    자바스크립트코드;
}

function 함수명2(){   // 지역함수
    function 함수명3(){
        자바스크립트코드;
    }
}


- 전역 함수는 자바스크립트 어디에서든 사용할 수 있는 함수이고, 
- 지역함수는 함수 스코프에서만 사용할 수 있는 함수이다. 


- 전역과 지역을 나누면 개발할 때 풍돌을 피할 수 있다.

```

26. 객체 생성자 함수의 활용
```java
function CheckWeight(name, height, weight) {
		this.userName = name;
		this.userHeight = height;
		this.userWeight = weight;
		this.minWeight;
		this.maxWeight;

		this.getInfo = function() {
			var str = ""
				str += "이름: " + this.userName + ", ";
				str += "키: " + this.userHeight + ", ";
				str += "몸무게: " + this.userWeight + "<br>";
				return  str;
		}
		this.getResult = function( ) {
			this.minWeight = (this.userHeight - 100) * 0.9 - 5;
			this.maxWeight = (this.userHeight - 100) * 0.9 + 5;

			if(this.userWeight >= this.minWeight && 
			this.userWeight <= this.maxWeight) {
				return "정상 몸무게입니다";
			} else if(this.userWeight < this.minWeight) {
				return "정상 몸무게보다 미달입니다";
			} else {
				return "정상 몸무게보다 초과입니다";
			}
		}
	}

	var jang = new CheckWeight("장보리", 168, 62);
	var park = new CheckWeight("박달재", 180, 88);
	console.log(jang);
	console.log(park);

	document.write(jang.getInfo());
	document.write(jang.getResult());
```
