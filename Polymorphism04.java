package sec03.exam02;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

interface Animal { public abstract void cry(); }

interface Pet { public abstract void play(); }



class Cat implements Animal, Pet {

    public void cry() {

        System.out.println("한류의 역사는 크게 세 단계에 걸쳐 성장했다.\n"
        		+ "1. 1990년대 후반에 사랑이 뭐길래, 의가형제 등이 수출되어 중국 CCTV에서 방영되면서 한류 열풍의 싹이 자라기 시작했다.\n\n"
        		+ "2. 2000년 1월 한국영화인 쉬리가 일본에서 개봉되어 대흥행을 기록하였고\n 2월에는 H.O.T가 베이징 공연을 성공적으로 마쳤으며\n"
        		+ "보아는 한국의 K-POP이 일본 진출을 길을 열고 겨울련가를 통해 배용준의 욘사마 신드롬으로 한류라는 단어가 전해졌다.\n\n"
        		+ "3. 현재에 와서 한국 드라마들이 넷플릭스에서 적극적으로 진출하면서 의미있는 성적을 거두고 있다.\n"
        		+ "특히 방탄소년단은 2020년 중반에 낸 신곡 Dynamite를 통해 21세기 최초로 빌보드 차트 HOT 100에서 1위를 한 아시아 아티스트이자,\n"
        		+ "비영어권 가수 최초 & 전세계 5번째로 Hot 100, Artist 100, Billboard 200차트 모두 1위를 석권한 아티스트가 되는등\n"
        		+ "그 영향력을 과시하고 있는 중이다.");

    }

    public void play() {

        System.out.println("한류의 종류는 크게 4개로 이루어져있다.\n"
        		+ "1. K-pop은 대한민국의 대중가요, 즉 korean popular music에서 팝 음악을 뜻하는 ‘Popular music’과 ‘Korea’의 합성어이다.\n"
        		+ "K-pop은 본래 음악 장르의 성격을 가진 용어였다. 그러다 2000년대 이후 한국만의 독자적인 아이돌 문화가 발달하면서, 음악 뿐만 아니라 아티스트가 추는 춤,\n"
        		+ "메이크업, 팬덤문화까지 포괄해서 'K-pop'이라 부르기 시작했다.\n\n"
        		+ "2. 한국드라마는 대한민국에서 제작된 드라마를 총칭해서 말하는 말. 한국뿐만 아니라 주로 동아시아, 중동, 중앙아시아, 동남아, 남아시아, 중남미 등을\n"
        		+ "중심으로 큰 인기를 얻게 되어 질적 발전을 거듭한 끝에, 현재는 K-POP과 더불어 한류를 이끌어 나가는 중심문화로 자리잡게 되었으며 여러 나라에 수출되고 있다.\n"
        		+ "줄여서 '한드'라고도 부른다\n\n"
        		+ "3. 한식은 주로 한국의 전통식 요리를 뜻하며, 현대적으로 재창조된 한식은 '퓨전 한식' 등으로도 불린다.\n"
        		+ "한식진흥법에서는 한국에서 사용되어 온 식재료 또는 그와 유사한 식재료를 사용하여 한국 고유의 조리방법 또는 그와 유사한 조리방법을 이용하여 만들어진 음식과 \n"
        		+ "그 음식과 관련된 유형·무형의 자원·활동 및 음식문화를 \"한식\"으로 정의하고 있다 (한식진흥법 제2조 제1호).\n"
        		+ "한식을 대표하는 음식으로는 비빔밥, 삼겹살, 잡채, 불고기 등이 있다.\n\n"
        		+ "4. 웹툰(Webtoon)은 네이버, 다음 등의 각종 플랫폼 매체에서 연재(連載)되는 디지털 만화를 지칭하는,\n"
        		+ "'한국에서 만들어진 단어이며 해외에서도 한국에서 유래한 디지털 만화 형식을 지칭하는 고유명사화 되었다.\n"
        		+ "대한민국의 최초의 웹툰/웹코믹은 한희작의 1996년작 《무인도》로, 25년 정도의 짧은 역사를 가지고 있다.\n"
        		+ "스마트폰을 기반으로 하는 콘텐츠 산업이기 때문에 웹툰의 접근성은 스마트폰의 보급률에 비례하며서 \n"
        		+ "웹툰 시장이 커지게 도니는 계기가 되었다. 대표적인 작품으로 나 혼자 레벨업, 이태원 클라스 등이 있다.");

    }

}

 

class Dog implements Animal, Pet {

    public void cry() {

        System.out.println("한류를 대표하는 유명인을 음악, 스포츠, 미디어로 나누어서 3명으로 선정하였습니다.\n"
        		+ "1. BTS는 방탄소년단을 줄여서 사용하는 말로 현재 K-POP을 이끌어가는 대표주자입니다.\n"
        		+ "미국 빌보드, 영국 오피셜 차트, 일본 오리콘을 비롯해 아이튠즈, 스포티파이, 애플뮤직 등 세계 유수의 차트 정상에 올랐고,\n"
        		+ "음반 판매량과 뮤직비디오 조회수, SNS 지수 등에서도 독보적인 기록을 써 내려가고 있다. 특히, 방탄소년단은 \n"
        		+ "한 주에 빌보드 ‘핫 100’ 차트와 ‘빌보드 200’ 차트 정상을 동시 정복한 최초의 그룹이며, 통산 ‘빌보드 200’ 6차례, ‘핫 100’ 6차례 1위를 차지했다.\n"
        		+ "또한, ‘제63회 그래미 어워드’에서 한국 가수 최초로 단독 무대를 펼쳐 ‘빌보드 뮤직 어워드’와 ‘아메리칸 뮤직 어워드’, ‘그래미 어워드’까지 \n"
        		+ "미국 3대 음악 시상식 무대에서 공연하는 기록을 세웠다. \n"
        		+ "멤버로는 리더: RM\n메인 댄서: 제이홉,지민\n메인 보컬: 정국 \n리드 래퍼: 슈가\n서브 보컬: 뷔, 진으로 이루어져 있다.\n\n"
        		+ "2. 손흥민은 대한민국 국적의 토트넘 홋스퍼 FC 소속 축구선수. 포지션은 윙어. 현재 대한민국 축구 국가대표팀의 주장이다.\n"
        		+ "프리미어 리그와 UEFA 챔피언스 리그 아시아 선수 역대 최다 득점자이자 최초로 발롱도르 후보 30인과 FIFA FIFPro 월드 XI 후보 55인에 선정됐다.\n"
        		+ "또한 FIFA 푸스카스상을 수상했으며, 프리미어 리그 이달의 선수에 3회 선정되었고, 아시아 선수 최초로 PFA 올해의 팀 선정 및 \n"
        		+ "프리미어 리그 득점왕에 등극해 골든부트를 수상했다.\n\n"
        		+ "3. 이정재는 대한민국의 배우이자 영화 감독으로 2021년, 넷플릭스 드라마 오징어 게임에 주연으로 출연하여 첫 넷플릭스 오리지널 작품에 참여했고,\n"
        		+ "작품이 전 세계적으로 히트를 치며 모래시계 이후 오랜만에 드라마 흥행작을 하나 추가했다.\n"
        		+ "전세계적인 신드롬을 일으키며 넷플릭스 역사상 역대 시청 시간 1위 작품을 기록하며 단기간 흥행으로는 왕좌의 게임을 넘어서는 열풍을 일으켰다.\n"
        		+ "그 결과 미국배우조합상, 크리틱스 초이스 시상식, 제74회 프라임타임 에미상 등 미국 메이저 시상식에서 남우주연상을 수상했다.\n"
        		+ "이는 대한민국 최초이자 비영어권 작품으로도 최초로 대한민국 배우의 커리어로서는 최상을 찍으며 역대 최고의 전성기를 맞이하고 있다.\n\n"
        		+ "4. 윤여정은 대한민국의 영화배우이자 탤런트로 2020년 1980년대에 아메리칸 드림을 꿈꾸고 이주한 한인가족을 그린 미국 영화 미나리에 출연했다.\n"
        		+ "미나리는 제36회 선댄스 영화제에서 대상 격인 심사위원대상과 최우수상 격인 관객상을 둘 다 수상하는 기염을 토했으며,\n"
        		+ "윤여정은 이후 미국배우조합상(SAG)과 영국 아카데미상(BAFTA)에서는 여우조연상 후보 노미네이트에 성공하였다. 한국 배우로는 최초의 결과이다.\n"
        		+ "미국 언론에서도 올해 최고의 연기나 주목해야 할 배우 리스트에 오르는 등 상당한 기대를 받고 있다.\n"
        		+ "결국 한국 배우 최초로 제93회 아카데미 시상식에 여우조연상으로 노미네이트됐다.");

    }

    public void play() {

        System.out.println("한류의 전망으로 총 3가지로 구분하여 설명할 수 있다.\n"
        		+ "1. 빠른 확장세: 2010년대 초까지만 하더라도 많은 한국인들은 자국이 선진국이라는 것을 실감하지 못했다. 따라서 한국 문화가 세계적으로 먹히리라 기대하지 않았고,\n"
        		+ "자연스레 한류는 언론들의 과대포장에 불과하다는 인식이 지배적이었다. 하지만 2020년대에 들어 방탄소년단, 블랙핑크, 트와이스 같은 유명 K-POP 그룹들은 한류의 열기에 다시금 불을 지폈다.\n"
        		+ "특히 방탄소년단은 코로나19로 전 세계가 혼란스럽던 2020년 중반에 낸 신곡 Dynamite를 통해 21세기 최초로 빌보드 차트 HOT 100에서 1위를 한 아시아 출신 아티스트이자,\n"
        		+ "비영어권 가수 최초 & 세계 5번째로 Hot 100, Artist 100, Billboard 200차트에서 1위를 모두 달성하며 세계적인 아티스트가 되었으며\n"
        		+ "미국의 언론사 CNN은 한류를 중심으로 성장한 동아시아 대중문화를 다룬 #기사에서 소셜 미디어 등의 발흥에 힘입어 이러한 대중화가 다가오는 10년 동안에도 꾸준히 지속될 것으로 전망했다.\n\n"
        		+ "2. 다양성: 한류의 지속성에 대해 부정적인 생각을 가진 사람들은 \"방송과 연예인에 치중된 한류는 불안정하고 한정돼있어 오래 지속되지 못할 것이다\"는 생각을 흔히 품는다.\n"
        		+ "하지만 우려와는 정반대로 오히려 그들을 통해 패션, 화장품, 음식, 관광, 무술, 산업, 영화, 심지어 도서 같은 그렇게 알려지지 않았을 것 같은 분야에도 \n"
        		+ "외국인들의 관심이 쏠리며 한류라는 개념이 더욱 넓어지고 굳건해지는 경향을 보였다는 것이다.\n\n"
        		+ "3. 한국어 관심 강화: 한류의 영향력을 꾸준히 유지하기 위해서는 한국어 교육에도 관심을 가질 필요가 있다.\n"
        		+ "비슷한 사례로 일본의 서브컬쳐가 한국에서 지속적인 수요가 있는 이유는 문화적으로 비슷한 점이 많은 것도 있지만, 일본 문화를 빠르게 접하기 위해 일본어를 익힌 팬층이 탄탄한 것도 한몫한다.\n"
        		+ "그러므로 한류를 밝은 전망을 위해서는 SNS와 같은 소셜 미디어로 빠른 확장세와 한류의 다양성을 홍보하며 한국어의 관심이 강화가 된다면 한류의 밝은 전망이 기대된다.");

    }

}

 

public class Polymorphism04 {

    public static void main(String[] args) throws IOException {
		String str = "한류:\n한류는 좁게는 음악, 영화, 드라마 같은 대중문화부터 시작하여 넓게는 패션, 화장품, 음식, 관광, 무술, 산업 등"
				+ "대한민국의 문화가 세계에 알려지는 현상을 뜻한다.";
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
    	FileWriter fw = new FileWriter("c:/out.txt");
		String title = "목차";
		String title1 = null;
		System.out.print("목차를 입력하세요: ");

    	int subtitle1 = 0;
		int i = 1;
		title1 = sc.nextLine();
		while(true) {
			if (title1.equals(title)) { 
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.print("목차를 입력하세요: ");
			title1 = sc.nextLine();
		}
		

		if (title1.equals(title)) {
			for (subtitle main1 : subtitle.values()) {
				System.out.println(i + ":" +  main1);
				i = i + 1;
			}
		}

		subtitle Main = null;
		Scanner sc1 = new Scanner(System.in);
		try {
			subtitle1 = sc1.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다. 1로 입력됩니다.");
			subtitle1 = 1;
		}
		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
    	
    	Cat c = new Cat();

        Dog d = new Dog();
        if (subtitle1 == 1) {
            c.cry();  
            subtitle1 = sc1.nextInt();
    		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
        }
        if (subtitle1 == 2) {
        	c.play();
        	subtitle1 = sc1.nextInt();
    		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
        }        
        if (subtitle1 == 3) {
        	d.cry();   
        	subtitle1 = sc1.nextInt();
    		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
        }         
        if (subtitle1 == 4) {
        	d.play(); 
        	subtitle1 = sc1.nextInt();
    		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
        }  
        if (subtitle1 == 5) {
            Scanner sc4 = new Scanner(System.in);
        	String write1 = sc4.nextLine();
    		String data = write1 + "\n이상으로 마칩니다.";
            fw.write(data);
            fw.close();
        	subtitle1 = sc.nextInt();
    		switch(subtitle1) {
			case 1:
				Main = subtitle.HISTORY; break;
			case 2:
				Main = subtitle.TYPE; break;
			case 3:
				Main = subtitle.CELEBRITY; break;
			case 4:
				Main = subtitle.PROSPECT; break;
			case 5:
				Main = subtitle.TAKEAWAY; break;
			case 6:
				Main = subtitle.EXIT; break;
		}
    	System.out.println(Main);
        }
        if (subtitle1 == 6) {
        	System.out.println("프로그램을 종료합니다.");
        }
    }

}