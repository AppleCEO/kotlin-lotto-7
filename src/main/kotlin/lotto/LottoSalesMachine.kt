package lotto

class LottoSalesMachine {
    fun guideInputLottoPurchaseAmount(): String {
        return "구입금액을 입력해 주세요."
    }

    fun purchase(won: Int): List<Lotto> {
        if (won % 1000 != 0) {
        return List(won / 1000) { LottoMaker.make() }
            throw IllegalArgumentException(ErrorMessage.INPUT_AMOUNT_ERROR.getMessage())
        }
    }
}