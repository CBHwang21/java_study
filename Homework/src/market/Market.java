package market;

import java.util.ArrayList;
import java.util.Scanner;
import event.Sale;
import event.Event;
import products.Bakery;
import products.Dairyproducts;
import products.Product;
import products.Frozenfoods;
import products.Fruits;
import products.Grain;
import products.Instantfood;
import products.Liquor;
import products.Meat;
import products.Seafood;
import products.Sundrygoods;
import products.Vegetables;
import products.WaterBeverage;

public class Market {

	// 쇼핑몰 이름
	String title;
	
	// 기존 계정 셋팅(메인 함수에서 변경하기)
	public String[] existingUsers = new String[2];
	private ArrayList<User> users = new ArrayList<>();
	String newUser;
	
	Product[] meat = new Product[3];
	Product[] vegetables = new Product[3];
	Product[] frozenfoods = new Product[3];
	Product[] dairyproducts = new Product[3];
	Product[] sundrygoods = new Product[3];
	Product[] liquor = new Product[3];
	Product[] waterbeverage = new Product[3];
	Product[] grain = new Product[3];
	Product[] seafood = new Product[3];
	Product[] bakery = new Product[3];
	Product[] instantfood = new Product[3];
	Product[] fruits = new Product[3];
	
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// 유저가 고른 상품 번호
	int productNo;
	
	// 하나의 스캐너 객체 (각각의 메소드에서 사용됨)
	Scanner scanner = new Scanner(System.in);
	
	// 총 상품 금액
	int total = 0;
	
	int random;
	
	/**
	 * 쇼핑몰 이름 설정(메인 함수에서 설정하기)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 기존 회원 등록하기
	 * @param id
	 * @param password
	 * 
	 */
	public void setExistingUsers(String id, String password) {		
		users.add(new User(id, password));		
	}
	
	/**
	 * 쇼핑몰 시작할 때 콘솔에 기본으로 찍히는 초기 알림
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " 쇼핑몰에 오신것을 환영합니다.  #");
		System.out.println("#  기존에 저희 쇼핑몰을 방문해 보신적이 있으신가요? [y/n]  #");
		System.out.printf("#  방문여부 : ");
		
		String isVisited = scanner.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
				System.exit(0); break;
		}
	}
	
	/**
	 * 기존 방문여부 y를 눌렀을 때, 기존에 존재하던 계정 고르는 메서드 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# 데이터 조회 결과, "+User.getCount()+"의 계정이 존재합니다. 원하시는 계정을 선택해주세요.");
		users.forEach(u -> System.out.println(u.toString()));
		System.out.printf("#  선택 -> ");
		
		int userNo = scanner.nextInt();
		
		if(userNo<0 || userNo > User.getCount()) {
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);  //시스템 종료 
		} else {
			//유저넘버는 users인덱스 번호보다 1크다. 그래서 -1해야 인덱스 번호임
			registeredUser(users.get(userNo-1).getId());
		}				
	}
	
	/**
	 * 회원가입
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  회원가입을 진행합니다.");
				
        String id = input(1);
        String password = input(2);

        System.out.println("계정이 개설되었습니다!");
        users.add(new User(id, password));
		
				
		System.out.println("====================================================");
		System.out.println("#  " + id + "님 환영합니다. 원하시는 카테고리를 선택해주세요.");
		
		selectCategory();
	}
    /**
     * 입력한 문자열이 공백있는지 비번은 다시한번 확인
     */
    private String input(int mode) {
    	
        String result = null;

        switch (mode) {
            case 1:
                while (true) {
                    System.out.println("id를 입력하세요!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("id는 공백을 허용하지 않습니다!");
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                while (true) {
                    System.out.println("비밀번호를 입력하세요!");
                    result = scanner.nextLine();

                    System.out.println("비밀번호 확인을 입력하세요!");
                    String passwordCheck = scanner.nextLine();

                    if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
                        System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다!");
                    } else if (!result.equals(passwordCheck)) {
                        System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
                    } else {
                        break;
                    }
                }
                break;
            case 3:
                while (true) {
                    System.out.println("비밀번호를 입력하세요!");
                    result = scanner.nextLine();

                    if (result.trim().isEmpty()) {
                        System.out.println("비밀번호가 공백입니다!");
                    } else {
                        break;
                    }
                }
                break;
        }

        return result;
    }
	
	/**
	 * 기존에 등록된 계정 불러오기
	 * @param userName
	 */
	public void registeredUser(String userId) {
		
		System.out.println("===================================================");
		System.out.println("#  " + userId + "님 환영합니다. 원하시는 카테고리를 선택해주세요.");
		
		selectCategory();
	}
		
	/**
	 * 쇼핑몰 게임 실행 시, 상품 generate
	 */
	public void genProduct() {
		
		meat[0] = new Meat("육류", "소고기(100g)", 5000, 10);
		meat[1] = new Meat("육류", "돼지고기(100g)", 3000, 10);
		meat[2] = new Meat("육류", "닭고기(100g)", 2000, 10);

		vegetables[0] = new Vegetables("채소", "감자(1kg)", 4000, 5);
		vegetables[1] = new Vegetables("채소", "당근(1kg)", 5000, 10);
		vegetables[2] = new Vegetables("채소", "고구마(1kg)", 3000, 7);

		frozenfoods[0] = new Frozenfoods("냉동식품", "냉동만두", 6000, 15);
		frozenfoods[1] = new Frozenfoods("냉동식품", "냉동피자", 5000, 10);
		frozenfoods[2] = new Frozenfoods("냉동식품", "냉동튀김", 4000, 12);

		dairyproducts[0] = new Dairyproducts("유제품", "우유(1L)", 2000, 14);
		dairyproducts[1] = new Dairyproducts("유제품", "치즈", 3000, 10);
		dairyproducts[2] = new Dairyproducts("유제품", "요구르트", 2000, 8);

		sundrygoods[0] = new Sundrygoods("잡화", "휴지", 5000, 18);
		sundrygoods[1] = new Sundrygoods("잡화", "치약", 2000, 15);
		sundrygoods[2] = new Sundrygoods("잡화", "칫솔", 3000, 13);

		liquor[0] = new Liquor("주류", "소주", 3000, 13);
		liquor[1] = new Liquor("주류", "맥주", 2000, 16);
		liquor[2] = new Liquor("주류", "와인", 10000, 5);

		waterbeverage[0] = new WaterBeverage("물, 음료", "생수(2L)", 2000, 15);
		waterbeverage[1] = new WaterBeverage("물, 음료", "콜라(1.5L)", 3000, 17);
		waterbeverage[2] = new WaterBeverage("물, 음료", "사이다(1.5L)", 3000, 12);

		grain[0] = new Grain("곡류", "쌀(1kg)", 10000, 8);
		grain[1] = new Grain("곡류", "잡곡(1kg)", 80000, 13);
		grain[2] = new Grain("곡류", "견과류(500g)", 4000, 10);

		seafood[0] = new Seafood("해산물", "생선", 4000, 15);
		seafood[1] = new Seafood("해산물", "새우(500g)", 3000, 12);
		seafood[2] = new Seafood("해산물", "오징어(500g)", 6000, 10);

		bakery[0] = new Bakery("제과", "과자", 3000, 20);
		bakery[1] = new Bakery("제과", "빵", 4000, 10);
		bakery[2] = new Bakery("제과", "초콜렛", 2000, 15);

		instantfood[0] = new Instantfood("즉석식품", "라면", 5000, 20);
		instantfood[1] = new Instantfood("즉석식품", "햇반", 2000, 15);
		instantfood[2] = new Instantfood("즉석식품", "3분요리", 2000, 5);

		fruits[0] = new Fruits("과일", "사과", 3000, 15);
		fruits[1] = new Fruits("과일", "배", 3000, 20);
		fruits[2] = new Fruits("과일", "오렌지", 4000, 10);
	}
	
	/**
	 * 카테고리 목록 출력하기
	 */
	public void selectCategory() {
		
		System.out.println("┏━━카테고리목록━━┓");
		System.out.println("┃ 1. 육류      ┃");
		System.out.println("┃ 2. 채소      ┃");
		System.out.println("┃ 3. 잡화      ┃");
		System.out.println("┃ 4. 주류      ┃");
		System.out.println("┃ 5. 과일      ┃");
		System.out.println("┃ 6. 곡류      ┃");
		System.out.println("┃ 7. 제과      ┃");
		System.out.println("┃ 8. 유제품    ┃");
		System.out.println("┃ 9. 해산물    ┃");
		System.out.println("┃ 10.물,음료   ┃");
		System.out.println("┃ 11.냉동식품   ┃");
		System.out.println("┃ 12.즉석식품   ┃");
		System.out.println("┃ 13.Event    ┃");
		System.out.println("┗━━━━━━━━━━━━━┛");
		System.out.println("오늘의 행사상품은 " + Sale.getRandomProduct() + "이고 " + Sale.getRandomDiscount() + "%를 할인해드립니다.");
		System.out.println("#  [0] : 장바구니 물품을 계산합니다.");
		System.out.printf("#  선택 -> ");
		
		int categoryNo = scanner.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * 카테고리 해당 번호에 맞는 상품 목록 출력
	 * @param categoryNo
	 */
	public void printProductList(int categoryNo) {
		switch(categoryNo) {
			case 0:
				
				checkout(); break;
			case 1:
				
				selectProduct(meat); break;
			case 2:
				
				selectProduct(vegetables); break;
			case 3:
				
				selectProduct(sundrygoods); break;
			case 4:
				
				selectProduct(liquor); break;
			case 5:
				
				selectProduct(fruits); break;
			case 6:
				
				selectProduct(grain); break;
			case 7:
				
				selectProduct(bakery); break;
			case 8:
				
				selectProduct(dairyproducts); break;
			case 9:
				
				selectProduct(seafood); break;
			case 10:
				
				selectProduct(waterbeverage); break;
			case 11:
				
				selectProduct(frozenfoods); break;
			case 12:
				
				selectProduct(instantfood); break;
			case 13:
				
				selectEvent(null); break;
			default:
				
				System.out.println("#  범위를 벗어났습니다. 프로그램이 종료되었습니다.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 이벤트란으로 이동
	 * @param event
	 */
	public void selectEvent(Event event) {
		
		System.out.println("---------------------------------------");
		System.out.println("#  오픈이벤트로 할인쿠폰을 드립니다.");
		random = Event.getRandomCoupon();
		System.out.printf("#  뽑기결과 : %d원 할인쿠폰\n", random);
		System.out.println("# 카테고리 목록으로 돌아갑니다.");
		
		selectCategory();
	}
	/**
	 * 	상품을 선택했을 때, 장바구니에 넣기
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s을 선택하셨습니다. 현재 장바구니 총 금액은 %d원 입니다.\n", product.getProductName(), total);
			System.out.println("#  Enter키를 누르시면 카테고리 목록이 출력됩니다.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  선택하신 %s 제품은 재고가 모두 소진되었습니다.\n", product.getProductName());
		}
		
		scanner.nextLine();
		scanner.nextLine(); // 입력 버퍼 지우기
		
		selectCategory();
	}
	
	/**
	 * 카테고리 해당 번호에 맞는 상품 목록 출력
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]의 의미는 0, 1, 2중 아무거나 와도 출력값이 같아서 0으로 설정함
		System.out.println("#  " + products[0].getCategoryName() + " 카테고리에 오신 것을 환영합니다. 원하시는 상품 번호를 입력해주세요.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  상품명" + (i + 1) + " : %s, 가격 : %d, 남은 재고 : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : 장바구니 물품들을 계산합니다.");
		System.out.printf("#  선택 -> ");
		
		productNo = scanner.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3 || productNo == 4 || productNo == 5 || productNo == 6 || productNo == 7 || productNo == 8 || productNo == 9 || productNo == 10 || productNo == 11 || productNo == 12) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * 체크아웃
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  장바구니가 비어있습니다. 장바구니에 상품을 담아주세요.");
			
			selectCategory();
		} else {
			System.out.printf("#  결제하실 총 금액은 %d원 입니다. \n# 할인쿠폰을 적용하시겠습니까? (y/n)", total);
			String getdiscount = scanner.next();
			switch(getdiscount) {
				case "y":
					System.out.println("할인쿠폰이 적용되어 " + random + "원 할인되었습니다.");
					total = total - Event.getRandomCoupon();
					break;
				case "n":
					printShoppingBasket(); break;
				
				default:
					System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
					System.exit(0); break;
			}
			
			System.out.printf("#  결제하실 총 금액은 %d원 입니다. \n#  ▼ 결제 방법을 선택해주세요 ▼\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  선택 -> ");
			
			int payment = scanner.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * 체크아웃할 때, 지금까지 장바구니에 넣어놨던 상품 목록들 확인차 출력
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("━━━━━━━━━━장바구니 목록━━━━━━━━━━━");
		System.out.println("순번\t   상품\t\t      가격");
		
		for (int i = 0; i < cart.size(); i++) {
			if(getProductName() = Sale.getRandomProduct()) {
				System.out.printf(" %d   ┃\t%s   \t┃%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice()*Sale.getRandomDiscount());
			} else {
				System.out.printf(" %d   ┃\t%s   \t┃%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
			}
			
		}
		
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}
	
	/**
	 * 현금 계산
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  현금 지불을 택하셨습니다. 15% 할인되어 결제하실 최종 금액은 %d원 입니다.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  지불하실 현금을 입력해주세요 : ");
		
		int cash = scanner.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", cash, cash - total);
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d원을 더 지불하셔야 합니다.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * 현금 차액 지불하기
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  차액 지불하기 : ");
		
		int difference = scanner.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d원을 더 지불하셔야 합니다.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d원을 지불하셨습니다. 거스름돈은 %d원 입니다.\n", difference , difference - (total - cash));
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다.");
		}
	}
	
	
	/**
	 * 카드 계산
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  영수증 필요하신가요?(y/n)");
		System.out.printf("#  선택 -> ");
		
		String isNeedRecipt = scanner.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  영수증 발급이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  계산이 완료되었습니다. 안녕히 가세요.");
			System.out.println("#  프로그램이 종료되었습니다."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  범위를 벗어났습니다. 프로그램을 종료합니다.");
			
			System.exit(0); break;
		}
	}
	
}
