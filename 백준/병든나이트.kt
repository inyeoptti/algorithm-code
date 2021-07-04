import kotlin.math.min

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    println(
        if (n == 1) {
            1
        } else if (n == 2) {
            min(4, ((m - 1) / 2) + 1)
        } else {
            if (m < 7) min(4, m)
            else 3 + (m - 5)
        }
    )
}


// 풀이 
// N × M 크기 체스판, 세로 × 가로

    //   나이트 이동 가능 범위
    /* 1. 2칸 위로, 1칸 오른쪽
       2. 1칸 위로, 2칸 오른쪽
       3. 1칸 아래로, 2칸 오른쪽
       4. 2칸 아래로, 1칸 오른쪽
       -> 무조건 세로가 1칸 이상씩은 이동

       여행에서 방문할 수 있는 칸의 최대 개수
       -> 오른쪽이나 왼쪽 최대한 적게 움직이기 => 오른쪽 선택

      밟은 칸 = 이동칸 개수 + 1(시작 타일)

      이동 횟수가 4번 이상이면 이동 방법을 모두 한 번씩 사용해야 한다.
      이동 횟수가 4번 미만이면 이동 방법에 대한 제약이 없다.

      [경우의 수]
      1. n == 1 -> return 1 (이동 불가)
      2. n == 2 -> {  2, 3 만 가능능
           max: 3번 (m: 7)   max m = 7
           if (m >= 7) return 3
           else { (m - 1) / 2 } -> 이게 3보다 크면 m이 7 초과 => min(3, (m - 1) / 2) 로 단축 가능
      }
      3. n >= 3 -> {

      }
    */
