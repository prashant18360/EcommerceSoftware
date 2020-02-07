//package ap_assign2;

import java.util.*;


class Item {
	
		private String Id;
		private String name;
		private double price;
		private int quantity;
		private String category;
		private String offer;
		private String merch_name;
		


		
		public Item(String name, int code,double price, int quantity, String category) {
			this.setName(name);
			this.setPrice(price);
			this.setQuantity(quantity);
			this.setCategory(category);
			this.setId(Integer.toString(code));
			this.setOffer("None");
			
		}
		
		
		public Item(Item it) {
			this.setId(it.getId());
			this.setName(it.getName());
			this.setPrice(it.getPrice());
			this.setQuantity(it.getQuantity());
			this.setCategory(it.getCategory());
			this.setOffer(it.getOffer());
			this.setMerch_name(it.getMerch_name());
		}
		
		
		
		
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getOffer() {
			return offer;
		}
		public void setOffer(String offer) {
			this.offer = offer;
		}
		public String getMerch_name() {
			return merch_name;
		}
		public void setMerch_name(String merch_name) {
			this.merch_name = merch_name;
		}
		
		
}

interface ecomfunc {
	
	public void search(String str);
	public void printreward();
	
}

class Merchant implements ecomfunc {
	
		private String name;
		private String address;
		private String Id;
		private double contrib_comp;
		private int additem_num;
		private int reward_won;
		private double account_bal;
		private ArrayList<Item> itm = new ArrayList<Item>();
	


		public Merchant(String name, String address, String Id) {
				this.setName(name);
				this.setAddress(address);
				this.setId(Id);
				this.setContrib_comp(0);
				this.setReward_won(0);
				this.setAdditem_num(10);
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id = id;
		}
		public double getContrib_comp() {
			return contrib_comp;
		}
		public void setContrib_comp(double contrib_comp) {
			this.contrib_comp = contrib_comp;
		}
		public int getAdditem_num() {
			return additem_num;
		}
		public void setAdditem_num(int additem_num) {
			this.additem_num = additem_num;
		}
		public int getReward_won() {
			return reward_won;
		}
		public void setReward_won(int reward_won) {
			this.reward_won = reward_won;
		}
		public double getAccount_bal() {
			return account_bal;
		}
		public void setAccount_bal(double account_bal) {
			this.account_bal = account_bal;
		}
		public ArrayList<Item> getItm() {
			return itm;
		}
		public void setItm(ArrayList<Item> itm) {
			this.itm = itm;
		}
		
		public void display(String cat) {
			ArrayList<Item> itb = this.getItm();
			for(int j=0;j<itb.size();j++) {
				Item it = itb.get(j);
				if(it.getCategory().compareTo(cat) == 0) {
					System.out.println(it.getId() + " " + it.getName() + " " + it.getPrice() + " " + it.getQuantity() + " " + it.getOffer() + " " + it.getCategory());
				}
			}
		}
		
		public void dispreward() {
			System.out.println(this.getReward_won() + " slots have been awarded from the reward scheme");
			
		}

		@Override
		public void search(String cat) {
			this.display(cat);
			
		}

		@Override
		public void printreward() {
			this.dispreward();
			
			
		}
	

}

class Customer implements ecomfunc {
	
		private String name;
		private String address;
		private String Id;
		private int placed_order;
		private ArrayList<Item> itc = new ArrayList<Item>();
		private double main_acc;
		private double reward_acc;
		private double total_reward;
		private Hashtable<String, Integer> cart = new Hashtable<String, Integer>();
		private ArrayList<String> itcode_cart = new ArrayList<String>();
		



		public Customer(String name, String address, String Id) {
			this.setName(name);
			this.setAddress(address);
			this.setId(Id);
			this.setPlaced_order(0);
			this.setReward_acc(0);
			this.setMain_acc(100);
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getId() {
			return Id;
		}
		public void setId(String id) {
			Id = id;
		}
		public int getPlaced_order() {
			return placed_order;
		}
		public void setPlaced_order(int placed_order) {
			this.placed_order = placed_order;
		}
		public ArrayList<Item> getItc() {
			return itc;
		}
		public void setItc(ArrayList<Item> itc) {
			this.itc = itc;
		}
		public double getMain_acc() {
			return main_acc;
		}

		public void setMain_acc(double main_acc) {
			this.main_acc = main_acc;
		}

		public double getReward_acc() {
			return reward_acc;
		}

		public void setReward_acc(double reward_acc) {
			this.reward_acc = reward_acc;
		}
		public double getTotal_reward() {
			return total_reward;
		}
		public void setTotal_reward(double total_reward) {
			this.total_reward = total_reward;
		}
		public Hashtable<String, Integer> getCart() {
			return cart;
		}
		public void setCart(Hashtable<String, Integer> cart) {
			this.cart = cart;
		}
		public ArrayList<String> getItcode_cart() {
			return itcode_cart;
		}
		public void setItcode_cart(ArrayList<String> itcode_cart) {
			this.itcode_cart = itcode_cart;
		}
		
		public void displayreward() {
			System.out.println(this.getTotal_reward());
		}
		
		public void dispitemplaced() {
			ArrayList<Item> lat_order = this.getItc();
			int size = lat_order.size();
			if(size <= 10) {
				for(int j=0;j<size;j++) {
					Item order = lat_order.get(j);
					System.out.println("Bought item " + order.getName() + " quantity : " + order.getQuantity() + " for Rs " + order.getPrice() + " from Merchant " + order.getMerch_name());
				}
			}
			else if(size > 10){
				int j=0;
				while(j < 10) {
					Item order = lat_order.get(j);
					System.out.println("Bought item " + order.getName() + " quantity : " + order.getQuantity() + " for Rs " + order.getPrice() + " from Merchant " + order.getMerch_name());
					j++;
				}	
			}
		}

		@Override
		public void search(String str) {
			// TODO Auto-generated method stub
			this.dispitemplaced();
			
		}

		@Override
		public void printreward() {
			// TODO Auto-generated method stub
			this.displayreward();
			
		}
		
		
}

class Working {
		public Working() {}
		
		public void usesearching(ecomfunc ecom, String cat) {
			ecom.search(cat);
		}

		public void usereward(ecomfunc ecom) {
			ecom.printreward();
		}
		
}


public class Ecommerce {
	
		
		private double accbal;
		private int idnum;
		private ArrayList<Merchant> m = new ArrayList<Merchant>();
		private ArrayList<Customer> c = new ArrayList<Customer>();
		private ArrayList<String> cat_list = new ArrayList<String>();

		public Ecommerce() {
			this.setAccbal(0);
			this.setM(this.addmer());
			this.setC(this.addcust());
		}
		
		public ArrayList<Merchant> addmer() {
			ArrayList<Merchant> mer = new ArrayList<Merchant>();
			Merchant mb1 = new Merchant("jack" , "G-60, Manchester", "1");
			mer.add(mb1);
			Merchant mb2 = new Merchant("john" , "A-25, chelmsford", "2");
			mer.add(mb2);
			Merchant mb3 = new Merchant("james" , "C-12, Las vegas", "3");
			mer.add(mb3);
			Merchant mb4 = new Merchant("jeff" , "F-31, California", "4");
			mer.add(mb4);
			Merchant mb5 = new Merchant("joseph" , "H-54, Cape Town", "5");
			mer.add(mb5);
			return mer;
		}
		
		public ArrayList<Customer> addcust() {
			ArrayList<Customer> cus = new ArrayList<Customer>();
			Customer cb1 = new Customer("Ali" , "New Delhi" , "1");
			cus.add(cb1);
			Customer cb2 = new Customer("noboby" , "kolkata" , "2");
			cus.add(cb2);
			Customer cb3 = new Customer("bruno" , "jaipur" , "3");
			cus.add(cb3);
			Customer cb4 = new Customer("borat" , "Mumbai" , "4");
			cus.add(cb4);
			Customer cb5 = new Customer("Aladeen" , "Banglore" , "5");
			cus.add(cb5);
			return cus;
		}
		
		public void merlist() {
			System.out.println("Choose Merchant");
			int l = m.size();
			for(int i=0;i<l;i++) {
				Merchant mtp = m.get(i);
				System.out.println(mtp.getId() + "  " + mtp.getName());
			}
		}
		
		public void Searchmerch_name(String id) {
			int l = m.size();
			for(int i=0;i<l;i++) {
				Merchant mtp = m.get(i);
				if(mtp.getId().compareTo(id) == 0) {
					System.out.println("Welcome " +  mtp.getName());
					return;
				}
			}
		}
		
		
		
		public void merch_menu() {
			System.out.println("Merchant Menu");
			System.out.println("1) Add item");
			System.out.println("2) Edit item");
			System.out.println("3) Search by category");
			System.out.println("4) Add offer");
			System.out.println("5) Rewards won");
			System.out.println("6) Exit");
			
		}
		
		
		
		public void addmerch_item(String Id, String name, double price, int quantity, String category) {
				int l = m.size();
				for(int i=0;i<l;i++) {
					Merchant mr = m.get(i);
					if(mr.getId().compareTo(Id) == 0 && mr.getAdditem_num()>0) {
						increm();
						Item iob = new Item(name,getIdnum(),price,quantity,category);
						ArrayList<Item> ib = mr.getItm();
						ib.add(iob);
						mr.setItm(ib);
						int t = mr.getAdditem_num();
						mr.setAdditem_num(--t);
						m.set(i, mr);
						System.out.println(iob.getId() + " " + iob.getName() + " " + iob.getPrice() + " " + iob.getQuantity() + " " +iob.getOffer() + " " + iob.getCategory());
						if(!cat_list.contains(iob.getCategory())) {
							cat_list.add(iob.getCategory());
						}
						break;	
					}
				}		
		}
		
		public void increm() {
			int t = this.getIdnum();
			this.setIdnum(++t);
		}
		
		
		
		public void editmerch_item(String Id, String Id2, double price, int quantity) {
				int l=m.size();
				for(int i=0;i<l;i++) {
					Merchant mr = m.get(i);
					if(mr.getId().compareTo(Id) == 0) {
						ArrayList<Item> ilist = mr.getItm();
						for(int j=0;j<ilist.size();j++) {
							Item ib = ilist.get(j);
							if(ib.getId().compareTo(Id2) == 0) {
								ib.setPrice(price);
								ib.setQuantity(quantity);
								ilist.set(j, ib);
								mr.setItm(ilist);
								m.set(i, mr);
								System.out.println(ib.getId() + " " + ib.getName() + " " + ib.getPrice() + " " + ib.getQuantity() + " " + ib.getOffer() + " " + ib.getCategory());
								break;
							}
						}
					}
				}
		}
		
		
		public void itemdisp(String Id) {
			int l=m.size();
			for(int i=0;i<l;i++) {
				Merchant mr = m.get(i);
				if(mr.getId().compareTo(Id) == 0) {
					ArrayList<Item> ilist = mr.getItm();
					for(int j=0;j<ilist.size();j++) {
						Item ib = ilist.get(j);
						System.out.println(ib.getId() + " " + ib.getName() + " " + ib.getPrice() + " " + ib.getQuantity() + " " + ib.getOffer() + " " +ib.getCategory());
					}
					break;
				}
			}
			
		}
		
		
		public void viewcategory() {
			int l=cat_list.size();
			for(int i=0;i<l;i++) {
				System.out.println(i+1 + ") " + cat_list.get(i));
			}
		}
		
		public void merchsearch(String cat) {
			    Working w = new Working();
				int l=m.size();
				for(int i=0;i<l;i++) {
					Merchant mr = m.get(i);
					w.usesearching(mr, cat);
				}
		}
		
		
		
		public void latestorderdisp(String code) {
			Working w = new Working();
			int l=c.size();
			for(int i=0;i<l;i++) {
				Customer cust = c.get(i);
				if(cust.getId().compareTo(code) == 0) {
					w.usesearching(cust, code);
				}
				
			}
		}
		
		
		
		
		public void addoffer(String id, String code, String off_sch) {
			int l = m.size();
			for(int i=0;i<l;i++) {
				Merchant mr = m.get(i);
				if(mr.getId().compareTo(id)==0) {
					ArrayList<Item> ilist = mr.getItm();
					for(int j=0;j<ilist.size();j++) {
						Item ib = ilist.get(j);
						if(ib.getId().compareTo(code)==0) {
							if(off_sch.compareTo("Buy one get one free") == 0 && ib.getQuantity()%2 == 0) {
								ib.setOffer(off_sch);
							}
							else if(off_sch.compareTo("25% off") == 0) {
								ib.setOffer(off_sch);
							}
							else {
								System.out.println("Offer can't apply due to unnecessary quantity of an item");
							}
							ilist.set(j, ib);
							mr.setItm(ilist);
							m.set(i, mr);
							System.out.println(ib.getId() + " " + ib.getName() + " " + ib.getPrice() + " " + ib.getQuantity() + " " + ib.getOffer() + " " + ib.getCategory());
							break;
						}
					}
				}
			}
		}
		
		
		public void rewardsfinder(String id) {
			Working w = new Working();
			int l=m.size();
			for(int i=0;i<l;i++) {
				Merchant mr = m.get(i);
				if(mr.getId().compareTo(id) == 0) {
						w.usereward(mr);
				}
			}
		}
		
		
		
		
		public void cuslist() {
			System.out.println("Choose Customer");
			int l=c.size();
			for(int i=0;i<l;i++) {
				Customer cust = c.get(i);
				System.out.println(cust.getId() + " " + cust.getName());
			}
		}
		
		public void Searchcus_name(String code) {
			int l=c.size();
			for(int i=0;i<l;i++) {
				Customer cust = c.get(i);
				if(cust.getId().compareTo(code) == 0) {
					System.out.println("Welcome " + cust.getName());
					return;
				}
			}
		}
		
		
		public void cust_menu() {
			System.out.println("Customer Menu");
			System.out.println("1) Search item");
			System.out.println("2) Checkout cart");
			System.out.println("3) Reward won");
			System.out.println("4) print latest orders");
			System.out.println("5) Exit");
		}
		
		public void method_trans() {
			System.out.println("Choose method of transaction");
			System.out.println("1) Buy Item");
			System.out.println("2) Add item to Cart");
			System.out.println("3) Exit");
		}
		
		public void buy_item(String code,String code1, int qty) {
				
				int l = m.size();
				for(int i=0;i<l;i++) {
					Merchant mr = m.get(i);
					ArrayList<Item> ilist = mr.getItm();
					for(int j=0;j<ilist.size();j++) {
						Item itb = ilist.get(j);
						if(itb.getId().compareTo(code1) == 0) {
							if(qty <= itb.getQuantity()) {
								if(itb.getOffer().compareTo("25% off") == 0) {
									double temp = itb.getPrice();
									double amt = qty*temp;
									amt = amt - (amt*0.25);
									double trans_cus = amt*0.005;
									
									itb.setQuantity(itb.getQuantity()-qty);
									ilist.set(j, itb);
									mr.setItm(ilist);
									
									double bal,bal_left;
									
									int l1=c.size();
									for(int h=0;h<l1;h++) {
										Customer cus = c.get(h);
										if(cus.getId().compareTo(code) == 0) {
												if(cus.getMain_acc() >= amt+trans_cus) {
													bal = amt + trans_cus;
													bal_left = cus.getMain_acc() - bal;
													cus.setMain_acc(bal_left);
													cus.setPlaced_order(cus.getPlaced_order()+1);
													
													ArrayList<Item> prlist = cus.getItc();
													Item prch = new Item(itb);
													prch.setPrice(amt);
													prch.setQuantity(qty);
													prch.setMerch_name(mr.getName());
													prlist.add(prch);
													cus.setItc(prlist);
													System.out.println("Item successfully bought");
													
													if(cus.getPlaced_order()%5 == 0) {
														cus.setReward_acc(cus.getReward_acc()+10);
														cus.setTotal_reward(cus.getTotal_reward()+10);
													}
													c.set(h, cus);
													
													this.setAccbal(this.getAccbal() + trans_cus*2);
													mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
													mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
										
													if(mr.getContrib_comp()>=100) {
														mr.setReward_won(mr.getReward_won()+1);
														mr.setAdditem_num(mr.getAdditem_num()+1);
													}
													m.set(i, mr);
												}
												
												else if(cus.getMain_acc() + cus.getReward_acc() >= amt+trans_cus) {
														bal = amt + trans_cus;
														cus.setReward_acc(cus.getReward_acc()-(bal-cus.getMain_acc()));
														cus.setMain_acc(0);
														cus.setPlaced_order(cus.getPlaced_order()+1);
														
														ArrayList<Item> prlist = cus.getItc();
														Item prch = new Item(itb);
														prch.setPrice(amt);
														prch.setQuantity(qty);
														prch.setMerch_name(mr.getName());
														prlist.add(prch);
														cus.setItc(prlist);
														
														System.out.println("Item successfully bought");
														
														if(cus.getPlaced_order()%5 == 0) {
															cus.setReward_acc(cus.getReward_acc()+10);
															cus.setTotal_reward(cus.getTotal_reward()+10);
														}
														c.set(h, cus);
														
														this.setAccbal(this.getAccbal() + trans_cus*2);
														mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
														mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
											
														if(mr.getContrib_comp()>=100) {
															mr.setReward_won(mr.getReward_won()+1);
															mr.setAdditem_num(mr.getAdditem_num()+1);
														}
														m.set(i, mr);
												}
												else {
													System.out.println("Out of money");
													return;
												}
												
										}
										
										
									}
									
									
								}
								else if(itb.getOffer().compareTo("Buy one get one free") == 0) {
									if(qty*2 <= itb.getQuantity()) {
									double temp = itb.getPrice();
									double amt = qty*temp;
									double trans_cus = amt*0.005;
									
									itb.setQuantity(itb.getQuantity()-qty*2);
									ilist.set(j, itb);
									mr.setItm(ilist);
									
									double bal,bal_left;
									
									int l1=c.size();
									for(int h=0;h<l1;h++) {
										Customer cus = c.get(h);
										if(cus.getId().compareTo(code) == 0) {
												if(cus.getMain_acc() >= amt+trans_cus) {
													bal = amt + trans_cus;
													bal_left = cus.getMain_acc() - bal;
													cus.setMain_acc(bal_left);
													cus.setPlaced_order(cus.getPlaced_order()+1);
													
													ArrayList<Item> prlist = cus.getItc();
													Item prch = new Item(itb);
													prch.setPrice(amt);
													prch.setQuantity(qty*2);
													prch.setMerch_name(mr.getName());
													prlist.add(prch);
													cus.setItc(prlist);
													
													System.out.println("Item successfully bought");
													
													if(cus.getPlaced_order()%5 == 0) {
														cus.setReward_acc(cus.getReward_acc()+10);
														cus.setTotal_reward(cus.getTotal_reward()+10);
													}
													c.set(h, cus);
													
													this.setAccbal(this.getAccbal() + trans_cus*2);
													mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
													mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
										
													if(mr.getContrib_comp()>=100) {
														mr.setReward_won(mr.getReward_won()+1);
														mr.setAdditem_num(mr.getAdditem_num()+1);
													}
													m.set(i, mr);
												}
												
												else if(cus.getMain_acc() + cus.getReward_acc() >= amt+trans_cus) {
														bal = amt + trans_cus;
														cus.setReward_acc(cus.getReward_acc()-(bal-cus.getMain_acc()));
														cus.setMain_acc(0);
														cus.setPlaced_order(cus.getPlaced_order()+1);
														
														ArrayList<Item> prlist = cus.getItc();
														Item prch = new Item(itb);
														prch.setPrice(amt);
														prch.setQuantity(qty*2);
														prch.setMerch_name(mr.getName());
														prlist.add(prch);
														cus.setItc(prlist);
														
														System.out.println("Item successfully bought");
														
														if(cus.getPlaced_order()%5 == 0) {
															cus.setReward_acc(cus.getReward_acc()+10);
															cus.setTotal_reward(cus.getTotal_reward()+10);
														}
														c.set(h, cus);
														
														this.setAccbal(this.getAccbal() + trans_cus*2);
														mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
														mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
											
														if(mr.getContrib_comp()>=100) {
															mr.setReward_won(mr.getReward_won()+1);
															mr.setAdditem_num(mr.getAdditem_num()+1);
														}
														m.set(i, mr);
												}
												else {
													System.out.println("Out of money");
													return;
												}
												
										}
										
										
									}
								}
									else {
										System.out.println("Out of Stock");
										return;
									}
								}
								else {
									double temp = itb.getPrice();
									double amt = qty*temp;
									double trans_cus = amt*0.005;
									
									itb.setQuantity(itb.getQuantity()-qty);
									ilist.set(j, itb);
									mr.setItm(ilist);
									
									double bal,bal_left;
									
									int l1=c.size();
									for(int h=0;h<l1;h++) {
										Customer cus = c.get(h);
										if(cus.getId().compareTo(code) == 0) {
												if(cus.getMain_acc() >= amt+trans_cus) {
													bal = amt + trans_cus;
													bal_left = cus.getMain_acc() - bal;
													cus.setMain_acc(bal_left);
													cus.setPlaced_order(cus.getPlaced_order()+1);
													
													ArrayList<Item> prlist = cus.getItc();
													Item prch = new Item(itb);
													prch.setPrice(amt);
													prch.setQuantity(qty);
													prch.setMerch_name(mr.getName());
													prlist.add(prch);
													cus.setItc(prlist);
													
													System.out.println("Item successfully bought");
													
													if(cus.getPlaced_order()%5 == 0) {
														cus.setReward_acc(cus.getReward_acc()+10);
														cus.setTotal_reward(cus.getTotal_reward()+10);
													}
													c.set(h, cus);
													
													this.setAccbal(this.getAccbal() + trans_cus*2);
													mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
													mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
										
													if(mr.getContrib_comp()>=100) {
														mr.setReward_won(mr.getReward_won()+1);
														mr.setAdditem_num(mr.getAdditem_num()+1);
													}
													m.set(i, mr);
												}
												
												else if(cus.getMain_acc() + cus.getReward_acc() >= amt+trans_cus) {
														bal = amt + trans_cus;
														cus.setReward_acc(cus.getReward_acc()-(bal-cus.getMain_acc()));
														cus.setMain_acc(0);
														cus.setPlaced_order(cus.getPlaced_order()+1);
														
														ArrayList<Item> prlist = cus.getItc();
														Item prch = new Item(itb);
														prch.setPrice(amt);
														prch.setQuantity(qty);
														prch.setMerch_name(mr.getName());
														prlist.add(prch);
														cus.setItc(prlist);
														
														System.out.println("Item successfully bought");
														
														if(cus.getPlaced_order()%5 == 0) {
															cus.setReward_acc(cus.getReward_acc()+10);
															cus.setTotal_reward(cus.getTotal_reward()+10);
														}
														c.set(h, cus);
														
														this.setAccbal(this.getAccbal() + trans_cus*2);
														mr.setContrib_comp(mr.getContrib_comp() + trans_cus);
														mr.setAccount_bal(mr.getAccount_bal()+bal-trans_cus);
											
														if(mr.getContrib_comp()>=100) {
															mr.setReward_won(mr.getReward_won()+1);
															mr.setAdditem_num(mr.getAdditem_num()+1);
														}
														m.set(i, mr);
												}
												else {
													System.out.println("Out of money");
													return;
												}
												
										}
										
										
									}
								}
								
							}
							else {
								System.out.println("Out of Stock");
								return;
							}
						}
					}
				}
			
		}
		
		
		
		public void addingcart(String code, String code1, int qty) {
				int l = c.size();
				for(int i=0;i<l;i++) {
					Customer cust = c.get(i);
					if(cust.getId().compareTo(code) == 0) {
						Hashtable<String, Integer> temp_cart = cust.getCart(); 
						ArrayList<String> itcode = cust.getItcode_cart();
						temp_cart.put(code1, qty);
						itcode.add(code1);
						cust.setItcode_cart(itcode);
						cust.setCart(temp_cart);
						c.set(i, cust);
					}
				}
		}
		
		
		public void checkoutcart(String code) {
				int l = c.size();
				for(int i=0;i<l;i++) {
					Customer cust = c.get(i);
					if(cust.getId().compareTo(code) == 0) {
						ArrayList<String> itcode = cust.getItcode_cart();
						Hashtable<String, Integer> cart_temp = cust.getCart();
						for(int j=0;j<itcode.size();j++) {
								buy_item(code, itcode.get(j), cart_temp.get(itcode.get(j)));
						}
					}
				}
		}
		
		
		public void custreward(String code) {
			Working w = new Working();
			int l=c.size();
			for(int i=0;i<l;i++) {
				Customer cust = c.get(i);
				if(cust.getId().compareTo(code) == 0) {
					w.usereward(cust);
				}
				
			}
	}
		
		
		public void mer_user_detail(String id, String name) {
				int l=m.size();
				for(int i=0;i<l;i++) {
					Merchant mr = m.get(i);
					if(mr.getId().compareTo(id)==0 && mr.getName().compareTo(name)==0) {
						System.out.println(mr.getName() + " " + mr.getAddress() + " " + mr.getContrib_comp());
						break;
					}
				}
		}
		
		
		public void cust_user_detail(String id, String name) {
				int l = c.size();
				for(int i=0;i<l;i++) {
					Customer cus = c.get(i);
					if(cus.getId().compareTo(id)==0 && cus.getName().compareTo(name)==0) {
						System.out.println(cus.getName() + " " + cus.getAddress() + " " + cus.getPlaced_order());
					}
				}
		}
		
		
		public double getAccbal() {
			return accbal;
		}
		public void setAccbal(double accbal) {
			this.accbal = accbal;
		}
		public int getIdnum() {
			return idnum;
		}
		public void setIdnum(int idnum) {
			this.idnum = idnum;
		}
		public ArrayList<Merchant> getM() {
			return m;
		}
		public void setM(ArrayList<Merchant> m) {
			this.m = m;
		}
		public ArrayList<Customer> getC() {
			return c;
		}
		public void setC(ArrayList<Customer> c) {
			this.c = c;
		}
		public ArrayList<String> getCat_list() {
			return cat_list;
		}

		public void setCat_list(ArrayList<String> cat_list) {
			this.cat_list = cat_list;
		}
		
		public void view_acc_bal() {
			System.out.println(this.getAccbal());
		}
	
	
		public void mercurydisp() {
			System.out.println("Welcome to Mercury");
			System.out.println("1) Enter as a Merchant");
			System.out.println("2) Enter as a Customer");
			System.out.println("3) see user details");
			System.out.println("4) Company account balance");
			System.out.println("5) Exit");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Ecommerce e = new Ecommerce();
		int choice;
		do {
			e.mercurydisp();
			choice = Integer.parseInt(in.nextLine());
			switch(choice) 
			{
				case 1 : e.merlist();
						 String id = in.nextLine();;
						 
						 int choice1;
						 do {
							 
							 e.Searchmerch_name(id);
							 e.merch_menu();
							 choice1 = Integer.parseInt(in.nextLine());
							 switch(choice1)
							 {
							 		case 1 : System.out.println("Enter item details");
							 				 System.out.println("item name:");
							 				 String name = in.nextLine();
							 				 System.out.println("item price");
							 				 double p = Double.parseDouble(in.nextLine());
							 				 System.out.println("item quantity:");
							 				 int q = Integer.parseInt(in.nextLine());
							 				 System.out.println("item category:");
							 				 String cat = in.nextLine();;
							 				 
							 				 e.addmerch_item(id,name,p,q,cat);
							 				 
							 				 break;
							 				 
							 				 
							 		case 2 : System.out.println("Choose Item by code");
							 				 e.itemdisp(id);
							 				 String id2 = in.nextLine();
							 				 System.out.println("Enter edit details");
							 				 System.out.println("item price: ");
							 				 double p_up = Double.parseDouble(in.nextLine());
							 				 System.out.println("item quantity: ");
							 				 int qty = Integer.parseInt(in.nextLine());
							 				 
							 				 e.editmerch_item(id, id2, p_up, qty);
							 				
							 				 break;
							 				 
							 				 
							 		case 3 : System.out.println("Choose a category");
							 				 e.viewcategory();
							 				 int ch = Integer.parseInt(in.nextLine());
							 				 String cat1 = e.getCat_list().get(ch-1);
							 				 e.merchsearch(cat1);
							 				 break;
							
							 		case 4 : System.out.println("Choose item by code");
							 				 e.itemdisp(id);
							 				 String id3 = in.nextLine();
							 				 System.out.println("Choose offer");
							 				 System.out.println("1) Buy one get one free");
							 				 System.out.println("2) 25% off");
							 				 int chof = Integer.parseInt(in.nextLine());
							 				 if(chof == 1) {
							 					e.addoffer(id, id3, "Buy one get one free");
							 				 }
							 				 else if(chof == 2) {
							 					e.addoffer(id, id3, "25% off");
							 				 }
							 				 
							 				 break;
							 		
							 		case 5 : e.rewardsfinder(id);
							 				 break;
							 		
							 		case 6 : break;
							 		
							 		default : System.out.println("Wrong choice. Enter again");
							 				  break;
							 }
						 }while(choice1 != 6);
						 
						 break;
						 
				case 2 : e.cuslist();
						 String code = in.nextLine();
						 
						 int choice2;
						 do 
						 {
							 	e.Searchcus_name(code);
							 	e.cust_menu();
							 	choice2 = Integer.parseInt(in.nextLine());
							 	switch(choice2) {
							 		case 1 : System.out.println("Choose Category");
							 				 e.viewcategory();
							 				 int ch = Integer.parseInt(in.nextLine());
							 				 String cat1 = e.getCat_list().get(ch-1);
							 				 System.out.println("Choose item by code");
							 				 e.merchsearch(cat1);
							 				 
							 				 System.out.println("Enter item code");
							 				 String code1 = in.nextLine();
							 				 System.out.println("Enter item quantity");
							 				 int qty = Integer.parseInt(in.nextLine());
							 				 
							 				 e.method_trans();
							 				 
							 				 int chm = Integer.parseInt(in.nextLine());
							 				 if(chm == 1) {
							 					 e.buy_item(code,code1,qty);
							 				 }
							 				 else if(chm == 2) {
							 					 e.addingcart(code, code1, qty);
							 				 }
							 				 else if(chm == 3) {
							 				 }
							 				 
							 				 break;
							 				 
							 		case 2 : e.checkoutcart(code);
							 				 break;
							 		
							 		case 3 : e.custreward(code);
							 				 break;
							 		
							 		case 4 : e.latestorderdisp(code);
							 				 break;
							 		
							 		case 5 : break;
							 		
							 		default : System.out.println("Wrong choice. Enter again");
							 				  break;
							 	}
							 	
						 }while(choice2 != 5);
						 
						 break;
				
				case 3 : System.out.println("1) Merchant");
						 System.out.println("2) Customer");
						 int ch = Integer.parseInt(in.nextLine());
						 if(ch == 1) {
							 System.out.println("Enter Merchant's ID");
							 String idm = in.nextLine();
							 System.out.println("Enter Merchant's Name");
							 String name = in.nextLine();
							 
							 e.mer_user_detail(idm, name);
							 
						 }
						 else if(ch == 2) {
							 System.out.println("Enter Customer's ID");
							 String idm = in.nextLine();
							 System.out.println("Enter Customer's Name");
							 String name = in.nextLine();
							 
							 e.cust_user_detail(idm, name);
						 }
						 break;

				case 4 : e.view_acc_bal();
						 break;
						 
				case 5 : break;
				
				default : System.out.println("Wrong choice. Enter again");
						  break;
					
			}
			
		} while(choice != 5);
		

	}

}
