package org.example.design.patterns.c_behavioral.b_leastUsed.iterator;

public interface ChannelCollection {
	public void addChannel(Channel c);
	public void removeChannel(Channel c);
	public ChannelIterator iterator(ChannelTypeEnum type);
}
