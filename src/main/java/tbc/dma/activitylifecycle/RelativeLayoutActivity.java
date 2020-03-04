package tbc.dma.activitylifecycle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RelativeLayoutActivity extends AppCompatActivity {

    private int teamATotalScore, teamBTotalScore = 0;
    private TextView txtTeamAScore, txtTeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        txtTeamAScore = findViewById(R.id.textViewTeamATotalScore);
        txtTeamBScore = findViewById(R.id.textViewTeamBTotalScore);
    }

    private void DisplayTeamATotalScores(int teamAScore){
        txtTeamAScore.setText(String.valueOf(teamAScore));
    }

    private void DisplayTeamBTotalScores(int teamBScore){
        txtTeamBScore.setText(String.valueOf(teamBScore));
    }

    public void ResetScores(View view){
        if(view.getId() == R.id.ButtonReset){
            teamATotalScore = 0;
            teamBTotalScore = 0;
            txtTeamAScore.setText(String.valueOf(teamATotalScore));
            txtTeamBScore.setText(String.valueOf(teamBTotalScore));
        }
    }

    public void TeamAPointsClickEvent(View view){

        switch (view.getId()) {
            case R.id.TeamA1:
                teamATotalScore += 1;
                String toastMsg = "Team A scored: 1 point.";
                Toast toast = Toast.makeText(this,"Team A scored: 1 point.", Toast.LENGTH_SHORT);
                toast.show();
                toast.setGravity(Gravity.TOP| Gravity.CENTER, 0, 0);
                break;
            case R.id.TeamA2:
                teamATotalScore += 2;
                break;
            case R.id.TeamA3:
                teamATotalScore += 3;
                break;
            case R.id.TeamA4:
                teamATotalScore += 4;
                break;
            case R.id.TeamA5:
                teamATotalScore += 5;
                break;
        }
        DisplayTeamATotalScores(teamATotalScore);
        Log.i("PointsClickEvent: ", String.valueOf(view.getId()));
    }

    public void TeamBPointsClickEvent(View view){
        switch (view.getId()) {
            case R.id.TeamB1:
                teamBTotalScore += 1;
                break;
            case R.id.TeamB2:
                teamBTotalScore += 2;
                break;
            case R.id.TeamB3:
                teamBTotalScore += 3;
                break;
            case R.id.TeamB4:
                teamBTotalScore += 4;
                break;
            case R.id.TeamB5:
                teamBTotalScore += 5;
                break;
        }
        DisplayTeamBTotalScores(teamBTotalScore);
        Log.i("PointsClickEvent: ", String.valueOf(view.getId()));
    }


}
