# 2주차 - 자동차 경주 게임
## 구현할 기능 목록
1. 자동차 입력받는 기능
   - 쉼표로 구분하는 로직
   - 분리된 이름의 5글자를 체크하는 로직
   - 자동차 대수 판별하는 로직
   - 입력받은 자동차의 전진횟수 0으로 초기화(생성자)
   - input : String
   - output : List<String, int>
      * Validation
        - 이름이 0글자인 경우(=쉼표만 입력된 경우) 에러
        - 글자를 5글자 초과한 경우 에러
        - 아무것도 입력되지 않았을 경우 에러

2. 시도 횟수 입력 받는 기능
   - 1자리 숫자 입력받는 기능
   - input : N/A
   - output : int 
      * Validation
        - 공백이 입력되면 에러
        - 숫자가 아니면 에러
        
3. 전진/멈춤 조건 판별하는 기능
   - 0~9사이의 랜덤숫자 생성하는 로직
   - 인풋값이 4이상인지 체크하는 로직
   - input : N/A
   - output : int or boolean 

4. 전진 횟수 누적하는 기능
   - 각 자동차별 전진 횟수 누적하는 로직
   - 인덱스 위치의 자동차 누적횟수 + 1
   - input : List<String, int>
   - output : List<String, int> 
        
5. 차수별 실행결과 출력하는 로직
   - input : List<String, int>
   - output : 인덱스별 자동차명 및 int 횟수만큼 - 출력
        
6. 우승자 판별 로직
   - 전진 cnt가 제일 큰 인덱스를 구하는 로직
   - input : 
   - output : 인덱스 반환

7. 인덱스 위치의 자동차 이름 반환하는 로직
   - input : 
   - output : 

8. 우승자 출력하는 기능
   - '최종 우승자 : ' 문구 출력
   - input :  
   - output : 

9. 전진 cnt가 max cnt와 동일한 인덱스가 존재하는지 확인하는 기능
   - input :  
   - output : 
   
10. 전진 cnt가 max cnt와 동일한 인덱스의 이름 출력하는 로직
   - input :  
   - output : 
 
