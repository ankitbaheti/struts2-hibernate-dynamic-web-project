package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cricket")
public class Cricket {
	@Id
	 @Column(name="team_name")
	 private String team_name;
	 @Column(name="total_matches")
	 private String total_matches;
	 @Column(name="match_win")
	 private int match_win;
	 @Column(name="match_loss")
	 private int match_loss;
	 @Column(name="match_tied")
	 private int match_tied;
	 @Column(name="no_result")
	 private int no_result;

	 public String getTeam_name() {
			return team_name;
		}
		public void setTeam_name(String team_name) {
			this.team_name = team_name;
		}
		public String getTotal_matches() {
			return total_matches;
		}
		public void setTotal_matches(String total_matches) {
			this.total_matches = total_matches;
		}
		public int getMatch_win() {
			return match_win;
		}
		public void setMatch_win(int match_win) {
			this.match_win = match_win;
		}
		public int getMatch_loss() {
			return match_loss;
		}
		public void setMatch_loss(int match_loss) {
			this.match_loss = match_loss;
		}
		public int getMatch_tied() {
			return match_tied;
		}
		public void setMatch_tied(int match_tied) {
			this.match_tied = match_tied;
		}
		public int getNo_result() {
			return no_result;
		}
		public void setNo_result(int no_result) {
			this.no_result = no_result;
		}
		

}
