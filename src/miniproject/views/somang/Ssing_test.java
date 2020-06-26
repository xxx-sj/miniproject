package miniproject.views.somang;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import miniproject.views.ChangePanel;
import miniproject.views.MainFrame;

//import miniProject4.com.kh.model.vo.UserAnswer;

public class Ssing_test {
	private MainFrame mf;
	private JPanel panel;
	int num;
	JTextField input; // 저장할공간 타입 선언
	JTextField input2;
	JTextField input3;
	private int cnt = 0;
	String one = "";
	String two = "";
	String three = "";
	boolean fone = false;
	boolean ftwo = false;
	boolean fthree = false;
	Thread thread;
	boolean isStop;
	Timer2 timer = new Timer2(mf,panel);
	MouseEvent e;

	public Ssing_test(MainFrame mf, JPanel panel, int num, JTextField input, JTextField input2, JTextField input3) {
		this.mf = mf;
		this.panel = panel;
		this.num = num;
		this.input = input;
		this.input2 = input2;
		this.input3 = input3;

	}

//	class clickPanel extends MouseAdapter {
//		@Override
//		public void mouseClicked(MouseEvent e) {
//
//			SsingNext_lose gp = new SsingNext_lose(mf);
//
//			ChangePanel.replacePanel(mf, panel, gp);
//
//		}
//	}

	public void cancel() {

		// Timer timer = new Timer(mf,panel);
		// boolean status = Thread.interrupted();
		// if(status) {
		// return;
		// }
		// if(!tStop) {

	

		
		thread.start();
		try {
			// if(!tStop) {
			// e.getSource()).stop();
			// }
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		timer.interrupt();
		System.out.println(timer);
		// if(tStop) {

		// }

		// }

		// new clickPanel();
		// click.mouseClicked();
		// ssingNext_lose();

	}

	

	public void ssingNext() {
		// 통과이면(cnt 2이상이고 3이되면) 노래점수+1
		// 타이머 stop하고 다음 화면 넘어가기
		SsingNext gp = new SsingNext(mf);

		ChangePanel.changePanel(mf, panel, gp);
		stop();
	}

	
	
	public void cancel2() {

		timer	= new Timer2(mf, panel);



		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		
		
		timer.interrupt();

//		timer.setStop(true);

	}
	public void ssingNext_lose() {
		// 통과이면(cnt 2이상이고 3이되면) 노래점수+1
		// 타이머 stop하고 다음 화면 넘어가기
		SsingNext_lose gp = new SsingNext_lose(mf);

		ChangePanel.changePanel(mf, panel, gp);
		stop();
	}
	
	public final void stop() {
		timer	= new Timer2(mf, panel);

		timer.interrupt();
	}
	
	
	//

	// 테스트 통과 여부
	public void StestPass(String[] inputArr) {
		String[][] answers = {{"얼굴", "몸매", "모든것이"}, 
							{"당신","나는","배터리"},
							{"당신", "동반자", "선물"},
							{"가인","가인","가인"},
							{"뭐야뭐야","뭐야","내버려"},
							{"유행가","나도","쿵쿵"},
							{"숫자","진짜","가슴"},
							{"땡벌","기다리다","추워요"},
							{"만드레","나는","향기속에"},
							{"오늘","사랑","헤어지면"}		
		};
		
	//public void StestPass(UserAnswer user) {
		//clickPanel cp = new clickPanel();

		// num값에 따른 정답 비교
		switch (num) {
		case 1:
			//if (tf == input && "당신".equals(input.getText())) {
			if (answers[0][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;

				}

				System.out.println(cnt);
			}
			if (answers[0][1].equals(inputArr[1])){
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[0][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
				// ((Timer2) timer).rre();
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 2:
			if (answers[1][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[1][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[1][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 3:
			if (answers[2][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[2][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[2][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 4:
			if (answers[3][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[3][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[3][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 5:
			if (answers[4][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[4][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[4][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 6:
			if (answers[5][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[5][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[5][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 7:
			if (answers[6][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[6][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[6][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 8:
			if (answers[7][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[7][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[7][2].equals(inputArr[2])){
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 9:
			if(answers[8][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[8][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[8][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;

		case 10:
			if (answers[9][0].equals(inputArr[0])) {
				// 값 한개씩 비교 후 정답이면 cnt++ -> cnt가 2이상이면 통과 -> 다음 장면으로 넘어가기?
				System.out.println(input.getText());
				if (!fone) {
					cnt++;
					fone = true;
				}

				System.out.println(cnt);
			}
			if (answers[9][1].equals(inputArr[1])) {
				System.out.println(cnt);
				if (!ftwo) {
					cnt++;
					ftwo = true;
				}
			}
			if (answers[9][2].equals(inputArr[2])) {
				System.out.println(cnt);
				if (!fthree) {
					cnt++;
					fthree = true;
				}
			}
			System.out.println(cnt);

			// ssingNext_lose();
			break;
		}
		
		ifTest();
	}

	
	public void ifTest() {
		if (cnt >= 2) {
			// 점수 획득 +1
			System.out.println("통과");
			System.out.println("cnt_pass : " + cnt);
			ssingNext();
			//cancel();

		} //else if(Thread.interrupted()){
			//System.out.println("실패!");
		else if (cnt < 2 ) {
				ssingNext_lose();
				System.out.println("cnt" + cnt);

					// 점수 획득 없음
					
					cancel2();
					// cp.mouseClicked(e);
				
					System.out.println("실패!");
			}
			
		//}*/
	}
	/*
	 * class clickPanel extends MouseAdapter {
	 * 
	 * @Override public void mouseClicked(MouseEvent e) { SsingNext gp = new
	 * SsingNext(mf); Timer timer = new Timer(mf,gp); Thread t1 = timer;
	 * t1.interrupt();
	 * 
	 * 
	 * 
	 * ChangePanel.replacePanel(mf, panel, gp);
	 * 
	 * }
	 * 
	 * }
	 */

}