package org.example.design.patterns.c_behavioral.b_leastUsed.iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {
	private List<Channel> channelsList;

	public ChannelCollectionImpl() {
		this.channelsList = new ArrayList<>();
	}

	public void addChannel(Channel c) {
		this.channelsList.add(c);
	}

	public void removeChannel(Channel c) {
		this.channelsList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channelsList);
	}

	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channelsList) {
			this.type = type;
			this.channels = channelsList;
		}

		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel channel = channels.get(position);
				if (channel.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL))
					return true;
				else
					position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel channel = channels.get(position++);
			return channel;
		}
	}
}
