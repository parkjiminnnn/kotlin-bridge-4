package bridge.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readBridgeSize(): String {
        println("다리의 길이를 입력해주세요.")
        val bridgeSize = Console.readLine()

        return bridgeSize
    }

    fun readMoving(): String {
        println("이동할 칸을 선택해주세요.")
        val move = Console.readLine()

        return move
    }

    fun readGameCommand(): String {
        println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)")
        val restart = Console.readLine()
        
        return restart
    }
}
