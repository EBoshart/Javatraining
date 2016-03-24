

	class NetteGroet extends Groet {
		private boolean geslacht;
		public String get() {
			if(geslacht) {
				return (super.get()+"meneer");
				
			} else {
				return (super.get()+"mevrouw");
			}
		
		}
		public NetteGroet(boolean geslacht) {
			
		}		
	
		
		
		public static void main(String[] args) {
			NetteGroet x=new NetteGroet(true);
			System.out.println(x.get());
			
		}
	}

