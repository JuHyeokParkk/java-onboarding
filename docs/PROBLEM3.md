## 🚀 기능 요구 사항

배달이가 좋아하는 369게임을 하고자 한다. 놀이법은 1부터 숫자를 하나씩 대면서, 3, 6, 9가 들어가는 숫자는 숫자를 말하는 대신 3, 6, 9의 개수만큼 손뼉을 쳐야 한다.

숫자 number가 매개변수로 주어질 때, 1부터 number까지 손뼉을 몇 번 쳐야 하는지 횟수를 return 하도록 solution 메서드를 완성하라.

### 제한사항

- number는 1 이상 10,000 이하인 자연수이다.

### 실행 결과 예시

| number | result |
| --- | --- |
| 13 | 4 |
| 33 | 14 |

## 구현 과정

주어진 수 : `n`



---
1. 1부터 `n`까지의 수에 대해 <br>각 자리의 숫자가 3, 6, 9 중 하나인지 확인한다.


2. 3, 6, 9 중 하나인 숫자의 개수를 기록한다.


3. 수를 탐색할 때, 이미 탐색한 기록이 있는 경우
   <br>그 기록의 값을 사용한다.


ex) `123`을 탐색할 때

    - 뒷자리부터 탐색한다.
    - 숫자 3을 확인한다. 
    - 남은 숫자는 1과 2인데 12의 경우 해당되는 숫자가 0개라는 
      기록이 존재하므로 이를 사용한다.
     