package org.example.design.patterns.c_behavioral.b_leastUsed.iterator;

public class MyClient {
	public static void main(String[] args) {
		ChannelCollection channels = new ChannelCollectionImpl();
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		
		ChannelIterator itrAll = channels.iterator(ChannelTypeEnum.ALL);
		while (itrAll.hasNext()) {
			System.out.println(itrAll.next().toString());
		}
		
		ChannelIterator itrEnglish = channels.iterator(ChannelTypeEnum.ENGLISH);
		while (itrEnglish.hasNext()) {
			System.out.println(itrEnglish.next().toString());
		}
	}
}
