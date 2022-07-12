package util.mapper;

import java.sql.ResultSet;

import models.Benefitiary;

public class BenefitiaryMapper {
	public Benefitiary mapToBenefitiary(Benefitiary benefitiary,ResultSet rs) {
		
		try {
			while(rs.next()) {
				benefitiary.setId(rs.getInt("ben_id"));
				benefitiary.setBenefitiary_name(rs.getString("ben_name"));
				benefitiary.setBenefitiary_nrc(rs.getString("ben_nrc"));
				benefitiary.setBenefitiary_phone(rs.getString("ben_phone"));
				benefitiary.setBenefitiary_email(rs.getString("ben_email"));
				benefitiary.setBenefitiary_address(rs.getString("ben_address"));
				benefitiary.setRelation(rs.getString("ben_relation"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return benefitiary;
	}
}
