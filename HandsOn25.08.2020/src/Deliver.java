import java.util.Scanner;
class Deliver {
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	Deliver(long over, long ball, long runs, String batsman, String bowler, String nonStriker)
	{
     over = over;
	 ball = ball;
	 runs = runs;
	 batsman = batsman;
	 bowler = bowler;
	 nonStriker = nonStriker;
	}
	Deliver()
	{
		
	}
	public long getOver()
	{
		return over;
	}
	public long getBall()
	{
		return ball;
	}
	public long getRuns()
	{
		return runs;
	}
	public String getBatsman()
	{
		return batsman;
	}
	public String getBowler()
	{
		return bowler;
	}
	public String getNonStriker()
	{
		return nonStriker;
	}
	public void setBall(long ball)
	{
		this.ball=ball;
		}
	public void setOver(long over)
	{
		this.over=over;
	}
	public void setRuns(long runs)
	{
		this.runs=runs;
	}
	public void setBatsman(String batsman)
	{
		this.batsman=batsman;
	}
	public void setBowler(String bowler)
	{
		this.bowler=bowler;
	}
	public void setNonStriker(String nonStriker)
	{
		this.nonStriker=nonStriker;
	}
	
}