package com.table.zzimkong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.table.zzimkong.vo.CompanyVO;
import com.table.zzimkong.vo.MenuVO;
import com.table.zzimkong.vo.PaymentInfo;
import com.table.zzimkong.vo.PaymentVO;
import com.table.zzimkong.vo.PreOrderInfo;
import com.table.zzimkong.vo.PreOrderVO;
import com.table.zzimkong.vo.ReservationVO;

@Mapper
public interface PaymentMapper {
	
//	int insertPayment();

	ReservationVO selectResForPay(ReservationVO res);

	int selectPoint(ReservationVO res);

	CompanyVO selectResCom(ReservationVO res);

	List<PreOrderInfo> selectPreOrder(ReservationVO res);

	int insertSubUsedPoint(@Param("sIdx") int sIdx, @Param("discountPoint") int discountPoint);

	int insertAddPoint(@Param("sIdx") int sIdx, @Param("earnedPoints") int earnedPoints);

	int insertPayment(@Param("res")ReservationVO res, @Param("sIdx") int sIdx,
					@Param("payNum")String payNum, @Param("payment") PaymentVO payment);

	int updateReservationStatus(ReservationVO res);

}