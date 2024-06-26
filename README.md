# 숫자 야구 게임

1부터 9까지의 숫자 중 서로 다른 세자리 숫자가 무엇인지 맞추는 게임이다
숫자를 입력했을 때 다른자리에 숫자가 있다면 볼, 같은자리에 있다면 스트라이크라고 알려준다. 아예 존재하지 않는 경우 Notting(나는 out이라고 알고있긴한데)이라고 알려준다. 이를 통해 유추해서 최종 숫자를 맞추는 게임이다. 
<br>
- 1부터 9까지의 서로 다른 임의의 수 3개를 정하고 맞추는 게임
- 정답은 랜덤 생성 또는 임의로 작성
- 세자리수 입력 시 입력 값 판별 (ex. 123, 423, ~~119~~, ~~011~~, ~~233~~)
- 숫자의 중복을 허용하지 않음
- 0으로 시작할수없음
- 올바른 세자리 값 입력 시 같은자리에 같은 숫자가 있으면 스트라이크, 다른자리에 있을 경우 볼 (ex, 정답이 123 이면 134 입력시 1스트라이크 1볼)
- 정답 작성 시 게임 종료
- 프로그램 시작 시 게임 시작, 게임기록보기, 종료하기라는 메뉴 생성
- 기록보기 선택 시 완료한 게임들의 시도횟수 출력
- 종료하기 선택 시 프로그램 종료

  ## 순서도
  ![bassballgame](https://github.com/taeaeaeae/BassballGame_kotlin/assets/46617216/88f2bc37-2488-406e-a5f5-c82860a86285)


  ## 패키지 설명
  
  ### gameplay
  - Game.kt : 게임 딜러
    > 게임 진행을 담당하며 심판을 데리고 3스트라이크라고 들으면 정답이라고 알려주며 아닐경우 몇볼 몇스트라이큰지 표시해준다.<br>
    > 게임 결과를 기록하며 지난기록까지 저장해두고 게임기가 기록을 보여달라고 하면 보여준다.
  - GameMachine.kt : 게임기
    > 게임을 시작하거나 종료, 기록을 볼수있게 해준다.
  - Numbers.kt : 숫자 관리자
    > 정답을 생성하고 입력값이 올바른지 점검해준다.
  - Umpire.kt : 심판
    > 어떤 상황일떼 볼이고 어떤 상황일때 스트라이크인지를 알고있어서 몇스트라이크 몇볼인지 알려준다.
    
  ### inline
  - inputHelper.kt : 입력도우미
    > 간단하게 입력해주도록 도와준다.
  - numCheck.kt : 중복체크기
    > 숫자 세개가 모두 서로 다른값이 맞는지 알려준다.

  ## 게임 진행
  ```javascript
  환영합니다! 원하시는 번호를 입력해주세요.
  1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기
  1                //사용자 입력값
  < 게임을 시작합니다 >
  숫자를 입력하세요
  123                //사용자 입력값
  Notting
  
  숫자를 입력하세요
  456                //사용자 입력값
  1스트라이크 
  
  숫자를 입력하세요
  578                //사용자 입력값
  2볼
  
  숫자를 입력하세요
  589                //사용자 입력값
  1스트라이크 2볼
  
  숫자를 입력하세요
  598                //사용자 입력값
  3볼
  
  숫자를 입력하세요
  859                //사용자 입력값
  정답입니다!
  
  환영합니다! 원하시는 번호를 입력해주세요.
  1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기
  2                //사용자 입력값
  < 게임 기록 보기 >
  1번째 게임 : 시도 횟수 - 9
  2번째 게임 : 시도 횟수 - 5
  
  환영합니다! 원하시는 번호를 입력해주세요.
  1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기
  3                //사용자 입력값
  < 숫자 야구 게임을 종료합니다 >
  ```

  ## 주의할 요소
  - 정답과 입력값 : 배열처럼 사용하기 위해서 문자열 사용
  - 정답 생성 : 코틀린의 Random() 클래스를 사용하여 세자리 자연수 중 각 자리의 숫자가 서로 중복되지 않아야 하기에 102 <= num < 988 의 범위 이내에서 생성
  - 기록하기 : Game().statr()를 실행 시 정답을 찾을때까지 반복문을 돌린 횟수를 반환하여 배열에 저장하고 인덱스 번호에 1씩 더해서 출력, 기록이 없으면 없다고 출력
  - 정답 판별 : 3스트라이크일 때 정답으로 간주
  - 예외처리 : NumberFormatException을 사용하여 숫자를 입력하지 않을 경우 다시 실행, Numbers().inputNum()에서 정규식을 사용해 세자리 숫자만 반환
  
<!--
  ## 정답 생성 및 사용자입력값 처리

  - 숫자 세개가 서로 중복인지 아닌지 판별하는 함수
  ```kotlin
  inline fun numCheck(num: String): Boolean {return num[0] == num[1] || num[0] == num[2] || num[2] == num[1]}
  ```
  - 정답을 생성하는 함수
  ```kotlin
    fun randomNum() : String{    //배열처럼 사용하기 위해 문자열 사용
        var num = "000"
        while(numCheck(num)) {        // 숫자값이 중복이면 다시 생성
            num = Random.nextInt(102, 988).toString()  // 세자리 수 중 숫자가 서로 중복되지 않아야 하기에 102<= num < 988 의 범위 이내에서 생성 
        }
        return num
    }
  ```
  - 사용자 입력값 판별
  ```kotlin
    fun inputNum() : String{
        var number = input("숫자를 입력하세요")
        while (!"\\d\\d\\d".toRegex().matches(number) || (number[0].equals("0") || numCheck(number))){
            println("올바르지 않은 입력값입니다\n")
            number = input("숫자를 입력하세요")
        }
        return number
    }
  ```
-->
