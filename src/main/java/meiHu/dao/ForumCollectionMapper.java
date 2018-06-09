package meiHu.dao;

import meiHu.entity.ForumPost;

import java.util.List;

public interface ForumCollectionMapper {
    /**
     * 根据帖子pid查询该帖子被收藏的次数
     * @param pid   执行select的帖子的pid
     * @return  该帖子被收藏的次数
     */
    public int selectCollectedCountByPid(int pid);

    //用户对一条帖子进行收藏
    public int addCollectionByUidAndPid(int uid,int pid);

    //用户对一条帖子进行取消收藏
    public int deleteCollectionByUidAndPid(int uid,int pid);

    /**
     * 根据帖子pid删除收藏该帖子的信息，为删除该帖子做准备
     * @param pid
     * @return
     */
    public boolean deleteCollectionByPid(int pid);

}
