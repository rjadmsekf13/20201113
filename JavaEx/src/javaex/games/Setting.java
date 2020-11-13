package javaex.games;

/**
 * @PackageName : javaex.setting
 * @FileName : Setting.java
 * @Since : 2020. 9. 11
 * @Author : KB
 * @Description :
 *              =====================================================================================
 *              Modification History
 *              =====================================================================================
 *              Date Author Note
 *              -------------------------------------------------------------------------------------
 *              2020. 9. 11 KB 최초 작성
 *
 */
public class Setting { // 설정
	private int totalScore;
	private boolean baseball;
	private boolean gugudan;
	private boolean word;

	public int getTotalScore() {
		return totalScore;
	}

	public void increaseTotalScore(int score) {
		this.totalScore += score;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public boolean isBaseball() {
		return baseball;
	}

	public void setBaseball(boolean baseball) {
		this.baseball = baseball;
	}

	public boolean isGugudan() {
		return gugudan;
	}

	public void setGugudan(boolean gugudan) {
		this.gugudan = gugudan;
	}

	public boolean isWord() {
		return word;
	}

	public void setWord(boolean word) {
		this.word = word;
	}
}
