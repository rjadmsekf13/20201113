package javaex.games;

/**
 * @PackageName		: javaex.games
 * @FileName		: Games.java
 * @Since			: 2020. 9. 11
 * @Author			: KB
 * @Description		: 
 * =====================================================================================
 * 								   Modification History
 * =====================================================================================
 * Date				Author				Note
 * -------------------------------------------------------------------------------------
 * 2020. 9. 11		KB				최초 작성
 *
 */
public class Games {
	protected int score;
    protected int gameCount;
    protected boolean success;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
