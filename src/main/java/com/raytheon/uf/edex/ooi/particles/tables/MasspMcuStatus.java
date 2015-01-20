package com.raytheon.uf.edex.ooi.particles.tables;

import com.raytheon.uf.edex.ooi.particles.CassandraParticle;
import com.raytheon.uf.edex.ooi.particles.DataParticleJson;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;
import java.util.List;
import java.math.BigInteger;

@Table(value = "massp_mcu_status")
public class MasspMcuStatus extends CassandraParticle {

    @Column(value = "massp_rga_current")
    private int masspRgaCurrent;

    @Column(value = "massp_turbo_current")
    private int masspTurboCurrent;

    @Column(value = "massp_heater_current")
    private int masspHeaterCurrent;

    @Column(value = "massp_roughing_current")
    private int masspRoughingCurrent;

    @Column(value = "massp_fan_current")
    private int masspFanCurrent;

    @Column(value = "massp_sbe_current")
    private int masspSbeCurrent;

    @Column(value = "massp_converter_24v_main")
    private int masspConverter24vMain;

    @Column(value = "massp_converter_12v_main")
    private int masspConverter12vMain;

    @Column(value = "massp_converter_24v_sec")
    private int masspConverter24vSec;

    @Column(value = "massp_converter_12v_sec")
    private int masspConverter12vSec;

    @Column(value = "massp_valve_current")
    private int masspValveCurrent;

    @Column(value = "massp_pressure_p1")
    private int masspPressureP1;

    @Column(value = "massp_pressure_p2")
    private int masspPressureP2;

    @Column(value = "massp_pressure_p3")
    private int masspPressureP3;

    @Column(value = "massp_pressure_p4")
    private int masspPressureP4;

    @Column(value = "massp_housing_pressure")
    private int masspHousingPressure;

    @Column(value = "massp_housing_humidity")
    private int masspHousingHumidity;

    @Column(value = "massp_temp_main_control")
    private int masspTempMainControl;

    @Column(value = "massp_temp_main_rough")
    private int masspTempMainRough;

    @Column(value = "massp_temp_sec_rough")
    private int masspTempSecRough;

    @Column(value = "massp_temp_main_24v")
    private int masspTempMain24v;

    @Column(value = "massp_temp_sec_24v")
    private int masspTempSec24v;

    @Column(value = "massp_temp_analyzer")
    private int masspTempAnalyzer;

    @Column(value = "massp_temp_nafion")
    private int masspTempNafion;

    @Column(value = "massp_temp_ion")
    private int masspTempIon;

    @Column(value = "massp_ph_meter_value")
    private int masspPhMeterValue;

    @Column(value = "massp_inlet_temp_value")
    private int masspInletTempValue;

    @Column(value = "massp_ph_meter_status")
    private int masspPhMeterStatus;

    @Column(value = "massp_inlet_temp_status")
    private int masspInletTempStatus;

    @Column(value = "massp_power_relay_turbo")
    private int masspPowerRelayTurbo;

    @Column(value = "massp_power_relay_rga")
    private int masspPowerRelayRga;

    @Column(value = "massp_power_relay_main_rough")
    private int masspPowerRelayMainRough;

    @Column(value = "massp_power_relay_sec_rough")
    private int masspPowerRelaySecRough;

    @Column(value = "massp_power_relay_fan1")
    private int masspPowerRelayFan1;

    @Column(value = "massp_power_relay_fan2")
    private int masspPowerRelayFan2;

    @Column(value = "massp_power_relay_fan3")
    private int masspPowerRelayFan3;

    @Column(value = "massp_power_relay_fan4")
    private int masspPowerRelayFan4;

    @Column(value = "massp_power_relay_aux2")
    private int masspPowerRelayAux2;

    @Column(value = "massp_power_relay_ph")
    private int masspPowerRelayPh;

    @Column(value = "massp_power_relay_pump")
    private int masspPowerRelayPump;

    @Column(value = "massp_power_relay_heaters")
    private int masspPowerRelayHeaters;

    @Column(value = "massp_power_relay_aux1")
    private int masspPowerRelayAux1;

    @Column(value = "massp_sample_valve1")
    private int masspSampleValve1;

    @Column(value = "massp_sample_valve2")
    private int masspSampleValve2;

    @Column(value = "massp_sample_valve3")
    private int masspSampleValve3;

    @Column(value = "massp_sample_valve4")
    private int masspSampleValve4;

    @Column(value = "massp_ground_relay_status")
    private int masspGroundRelayStatus;

    @Column(value = "massp_external_valve1_status")
    private int masspExternalValve1Status;

    @Column(value = "massp_external_valve2_status")
    private int masspExternalValve2Status;

    @Column(value = "massp_external_valve3_status")
    private int masspExternalValve3Status;

    @Column(value = "massp_external_valve4_status")
    private int masspExternalValve4Status;

    @Column(value = "massp_cal_bag1_minutes")
    private int masspCalBag1Minutes;

    @Column(value = "massp_cal_bag2_minutes")
    private int masspCalBag2Minutes;

    @Column(value = "massp_cal_bag3_minutes")
    private int masspCalBag3Minutes;

    @Column(value = "massp_nafion_heater_status")
    private int masspNafionHeaterStatus;

    @Column(value = "massp_nafion_heater1_power")
    private int masspNafionHeater1Power;

    @Column(value = "massp_nafion_heater2_power")
    private int masspNafionHeater2Power;

    @Column(value = "massp_nafion_core_temp")
    private int masspNafionCoreTemp;

    @Column(value = "massp_nafion_elapsed_time")
    private int masspNafionElapsedTime;

    @Column(value = "massp_ion_chamber_heater_status")
    private int masspIonChamberHeaterStatus;

    @Column(value = "massp_ion_chamber_heater1_status")
    private int masspIonChamberHeater1Status;

    @Column(value = "massp_ion_chamber_heater2_status")
    private int masspIonChamberHeater2Status;

    public void fill(DataParticleJson particle, String sensor, String method) {
        super.fill(particle, sensor, method);
        setMasspRgaCurrent((int) particle.get("massp_rga_current"));
        setMasspTurboCurrent((int) particle.get("massp_turbo_current"));
        setMasspHeaterCurrent((int) particle.get("massp_heater_current"));
        setMasspRoughingCurrent((int) particle.get("massp_roughing_current"));
        setMasspFanCurrent((int) particle.get("massp_fan_current"));
        setMasspSbeCurrent((int) particle.get("massp_sbe_current"));
        setMasspConverter24vMain((int) particle.get("massp_converter_24v_main"));
        setMasspConverter12vMain((int) particle.get("massp_converter_12v_main"));
        setMasspConverter24vSec((int) particle.get("massp_converter_24v_sec"));
        setMasspConverter12vSec((int) particle.get("massp_converter_12v_sec"));
        setMasspValveCurrent((int) particle.get("massp_valve_current"));
        setMasspPressureP1((int) particle.get("massp_pressure_p1"));
        setMasspPressureP2((int) particle.get("massp_pressure_p2"));
        setMasspPressureP3((int) particle.get("massp_pressure_p3"));
        setMasspPressureP4((int) particle.get("massp_pressure_p4"));
        setMasspHousingPressure((int) particle.get("massp_housing_pressure"));
        setMasspHousingHumidity((int) particle.get("massp_housing_humidity"));
        setMasspTempMainControl((int) particle.get("massp_temp_main_control"));
        setMasspTempMainRough((int) particle.get("massp_temp_main_rough"));
        setMasspTempSecRough((int) particle.get("massp_temp_sec_rough"));
        setMasspTempMain24v((int) particle.get("massp_temp_main_24v"));
        setMasspTempSec24v((int) particle.get("massp_temp_sec_24v"));
        setMasspTempAnalyzer((int) particle.get("massp_temp_analyzer"));
        setMasspTempNafion((int) particle.get("massp_temp_nafion"));
        setMasspTempIon((int) particle.get("massp_temp_ion"));
        setMasspPhMeterValue((int) particle.get("massp_ph_meter_value"));
        setMasspInletTempValue((int) particle.get("massp_inlet_temp_value"));
        setMasspPhMeterStatus((int) particle.get("massp_ph_meter_status"));
        setMasspInletTempStatus((int) particle.get("massp_inlet_temp_status"));
        setMasspPowerRelayTurbo((int) particle.get("massp_power_relay_turbo"));
        setMasspPowerRelayRga((int) particle.get("massp_power_relay_rga"));
        setMasspPowerRelayMainRough((int) particle.get("massp_power_relay_main_rough"));
        setMasspPowerRelaySecRough((int) particle.get("massp_power_relay_sec_rough"));
        setMasspPowerRelayFan1((int) particle.get("massp_power_relay_fan1"));
        setMasspPowerRelayFan2((int) particle.get("massp_power_relay_fan2"));
        setMasspPowerRelayFan3((int) particle.get("massp_power_relay_fan3"));
        setMasspPowerRelayFan4((int) particle.get("massp_power_relay_fan4"));
        setMasspPowerRelayAux2((int) particle.get("massp_power_relay_aux2"));
        setMasspPowerRelayPh((int) particle.get("massp_power_relay_ph"));
        setMasspPowerRelayPump((int) particle.get("massp_power_relay_pump"));
        setMasspPowerRelayHeaters((int) particle.get("massp_power_relay_heaters"));
        setMasspPowerRelayAux1((int) particle.get("massp_power_relay_aux1"));
        setMasspSampleValve1((int) particle.get("massp_sample_valve1"));
        setMasspSampleValve2((int) particle.get("massp_sample_valve2"));
        setMasspSampleValve3((int) particle.get("massp_sample_valve3"));
        setMasspSampleValve4((int) particle.get("massp_sample_valve4"));
        setMasspGroundRelayStatus((int) particle.get("massp_ground_relay_status"));
        setMasspExternalValve1Status((int) particle.get("massp_external_valve1_status"));
        setMasspExternalValve2Status((int) particle.get("massp_external_valve2_status"));
        setMasspExternalValve3Status((int) particle.get("massp_external_valve3_status"));
        setMasspExternalValve4Status((int) particle.get("massp_external_valve4_status"));
        setMasspCalBag1Minutes((int) particle.get("massp_cal_bag1_minutes"));
        setMasspCalBag2Minutes((int) particle.get("massp_cal_bag2_minutes"));
        setMasspCalBag3Minutes((int) particle.get("massp_cal_bag3_minutes"));
        setMasspNafionHeaterStatus((int) particle.get("massp_nafion_heater_status"));
        setMasspNafionHeater1Power((int) particle.get("massp_nafion_heater1_power"));
        setMasspNafionHeater2Power((int) particle.get("massp_nafion_heater2_power"));
        setMasspNafionCoreTemp((int) particle.get("massp_nafion_core_temp"));
        setMasspNafionElapsedTime((int) particle.get("massp_nafion_elapsed_time"));
        setMasspIonChamberHeaterStatus((int) particle.get("massp_ion_chamber_heater_status"));
        setMasspIonChamberHeater1Status((int) particle.get("massp_ion_chamber_heater1_status"));
        setMasspIonChamberHeater2Status((int) particle.get("massp_ion_chamber_heater2_status"));
    }

    public int getMasspRgaCurrent() {
        return masspRgaCurrent;
    }

    public void setMasspRgaCurrent(int masspRgaCurrent) {
        this.masspRgaCurrent = masspRgaCurrent;
    }
    public int getMasspTurboCurrent() {
        return masspTurboCurrent;
    }

    public void setMasspTurboCurrent(int masspTurboCurrent) {
        this.masspTurboCurrent = masspTurboCurrent;
    }
    public int getMasspHeaterCurrent() {
        return masspHeaterCurrent;
    }

    public void setMasspHeaterCurrent(int masspHeaterCurrent) {
        this.masspHeaterCurrent = masspHeaterCurrent;
    }
    public int getMasspRoughingCurrent() {
        return masspRoughingCurrent;
    }

    public void setMasspRoughingCurrent(int masspRoughingCurrent) {
        this.masspRoughingCurrent = masspRoughingCurrent;
    }
    public int getMasspFanCurrent() {
        return masspFanCurrent;
    }

    public void setMasspFanCurrent(int masspFanCurrent) {
        this.masspFanCurrent = masspFanCurrent;
    }
    public int getMasspSbeCurrent() {
        return masspSbeCurrent;
    }

    public void setMasspSbeCurrent(int masspSbeCurrent) {
        this.masspSbeCurrent = masspSbeCurrent;
    }
    public int getMasspConverter24vMain() {
        return masspConverter24vMain;
    }

    public void setMasspConverter24vMain(int masspConverter24vMain) {
        this.masspConverter24vMain = masspConverter24vMain;
    }
    public int getMasspConverter12vMain() {
        return masspConverter12vMain;
    }

    public void setMasspConverter12vMain(int masspConverter12vMain) {
        this.masspConverter12vMain = masspConverter12vMain;
    }
    public int getMasspConverter24vSec() {
        return masspConverter24vSec;
    }

    public void setMasspConverter24vSec(int masspConverter24vSec) {
        this.masspConverter24vSec = masspConverter24vSec;
    }
    public int getMasspConverter12vSec() {
        return masspConverter12vSec;
    }

    public void setMasspConverter12vSec(int masspConverter12vSec) {
        this.masspConverter12vSec = masspConverter12vSec;
    }
    public int getMasspValveCurrent() {
        return masspValveCurrent;
    }

    public void setMasspValveCurrent(int masspValveCurrent) {
        this.masspValveCurrent = masspValveCurrent;
    }
    public int getMasspPressureP1() {
        return masspPressureP1;
    }

    public void setMasspPressureP1(int masspPressureP1) {
        this.masspPressureP1 = masspPressureP1;
    }
    public int getMasspPressureP2() {
        return masspPressureP2;
    }

    public void setMasspPressureP2(int masspPressureP2) {
        this.masspPressureP2 = masspPressureP2;
    }
    public int getMasspPressureP3() {
        return masspPressureP3;
    }

    public void setMasspPressureP3(int masspPressureP3) {
        this.masspPressureP3 = masspPressureP3;
    }
    public int getMasspPressureP4() {
        return masspPressureP4;
    }

    public void setMasspPressureP4(int masspPressureP4) {
        this.masspPressureP4 = masspPressureP4;
    }
    public int getMasspHousingPressure() {
        return masspHousingPressure;
    }

    public void setMasspHousingPressure(int masspHousingPressure) {
        this.masspHousingPressure = masspHousingPressure;
    }
    public int getMasspHousingHumidity() {
        return masspHousingHumidity;
    }

    public void setMasspHousingHumidity(int masspHousingHumidity) {
        this.masspHousingHumidity = masspHousingHumidity;
    }
    public int getMasspTempMainControl() {
        return masspTempMainControl;
    }

    public void setMasspTempMainControl(int masspTempMainControl) {
        this.masspTempMainControl = masspTempMainControl;
    }
    public int getMasspTempMainRough() {
        return masspTempMainRough;
    }

    public void setMasspTempMainRough(int masspTempMainRough) {
        this.masspTempMainRough = masspTempMainRough;
    }
    public int getMasspTempSecRough() {
        return masspTempSecRough;
    }

    public void setMasspTempSecRough(int masspTempSecRough) {
        this.masspTempSecRough = masspTempSecRough;
    }
    public int getMasspTempMain24v() {
        return masspTempMain24v;
    }

    public void setMasspTempMain24v(int masspTempMain24v) {
        this.masspTempMain24v = masspTempMain24v;
    }
    public int getMasspTempSec24v() {
        return masspTempSec24v;
    }

    public void setMasspTempSec24v(int masspTempSec24v) {
        this.masspTempSec24v = masspTempSec24v;
    }
    public int getMasspTempAnalyzer() {
        return masspTempAnalyzer;
    }

    public void setMasspTempAnalyzer(int masspTempAnalyzer) {
        this.masspTempAnalyzer = masspTempAnalyzer;
    }
    public int getMasspTempNafion() {
        return masspTempNafion;
    }

    public void setMasspTempNafion(int masspTempNafion) {
        this.masspTempNafion = masspTempNafion;
    }
    public int getMasspTempIon() {
        return masspTempIon;
    }

    public void setMasspTempIon(int masspTempIon) {
        this.masspTempIon = masspTempIon;
    }
    public int getMasspPhMeterValue() {
        return masspPhMeterValue;
    }

    public void setMasspPhMeterValue(int masspPhMeterValue) {
        this.masspPhMeterValue = masspPhMeterValue;
    }
    public int getMasspInletTempValue() {
        return masspInletTempValue;
    }

    public void setMasspInletTempValue(int masspInletTempValue) {
        this.masspInletTempValue = masspInletTempValue;
    }
    public int getMasspPhMeterStatus() {
        return masspPhMeterStatus;
    }

    public void setMasspPhMeterStatus(int masspPhMeterStatus) {
        this.masspPhMeterStatus = masspPhMeterStatus;
    }
    public int getMasspInletTempStatus() {
        return masspInletTempStatus;
    }

    public void setMasspInletTempStatus(int masspInletTempStatus) {
        this.masspInletTempStatus = masspInletTempStatus;
    }
    public int getMasspPowerRelayTurbo() {
        return masspPowerRelayTurbo;
    }

    public void setMasspPowerRelayTurbo(int masspPowerRelayTurbo) {
        this.masspPowerRelayTurbo = masspPowerRelayTurbo;
    }
    public int getMasspPowerRelayRga() {
        return masspPowerRelayRga;
    }

    public void setMasspPowerRelayRga(int masspPowerRelayRga) {
        this.masspPowerRelayRga = masspPowerRelayRga;
    }
    public int getMasspPowerRelayMainRough() {
        return masspPowerRelayMainRough;
    }

    public void setMasspPowerRelayMainRough(int masspPowerRelayMainRough) {
        this.masspPowerRelayMainRough = masspPowerRelayMainRough;
    }
    public int getMasspPowerRelaySecRough() {
        return masspPowerRelaySecRough;
    }

    public void setMasspPowerRelaySecRough(int masspPowerRelaySecRough) {
        this.masspPowerRelaySecRough = masspPowerRelaySecRough;
    }
    public int getMasspPowerRelayFan1() {
        return masspPowerRelayFan1;
    }

    public void setMasspPowerRelayFan1(int masspPowerRelayFan1) {
        this.masspPowerRelayFan1 = masspPowerRelayFan1;
    }
    public int getMasspPowerRelayFan2() {
        return masspPowerRelayFan2;
    }

    public void setMasspPowerRelayFan2(int masspPowerRelayFan2) {
        this.masspPowerRelayFan2 = masspPowerRelayFan2;
    }
    public int getMasspPowerRelayFan3() {
        return masspPowerRelayFan3;
    }

    public void setMasspPowerRelayFan3(int masspPowerRelayFan3) {
        this.masspPowerRelayFan3 = masspPowerRelayFan3;
    }
    public int getMasspPowerRelayFan4() {
        return masspPowerRelayFan4;
    }

    public void setMasspPowerRelayFan4(int masspPowerRelayFan4) {
        this.masspPowerRelayFan4 = masspPowerRelayFan4;
    }
    public int getMasspPowerRelayAux2() {
        return masspPowerRelayAux2;
    }

    public void setMasspPowerRelayAux2(int masspPowerRelayAux2) {
        this.masspPowerRelayAux2 = masspPowerRelayAux2;
    }
    public int getMasspPowerRelayPh() {
        return masspPowerRelayPh;
    }

    public void setMasspPowerRelayPh(int masspPowerRelayPh) {
        this.masspPowerRelayPh = masspPowerRelayPh;
    }
    public int getMasspPowerRelayPump() {
        return masspPowerRelayPump;
    }

    public void setMasspPowerRelayPump(int masspPowerRelayPump) {
        this.masspPowerRelayPump = masspPowerRelayPump;
    }
    public int getMasspPowerRelayHeaters() {
        return masspPowerRelayHeaters;
    }

    public void setMasspPowerRelayHeaters(int masspPowerRelayHeaters) {
        this.masspPowerRelayHeaters = masspPowerRelayHeaters;
    }
    public int getMasspPowerRelayAux1() {
        return masspPowerRelayAux1;
    }

    public void setMasspPowerRelayAux1(int masspPowerRelayAux1) {
        this.masspPowerRelayAux1 = masspPowerRelayAux1;
    }
    public int getMasspSampleValve1() {
        return masspSampleValve1;
    }

    public void setMasspSampleValve1(int masspSampleValve1) {
        this.masspSampleValve1 = masspSampleValve1;
    }
    public int getMasspSampleValve2() {
        return masspSampleValve2;
    }

    public void setMasspSampleValve2(int masspSampleValve2) {
        this.masspSampleValve2 = masspSampleValve2;
    }
    public int getMasspSampleValve3() {
        return masspSampleValve3;
    }

    public void setMasspSampleValve3(int masspSampleValve3) {
        this.masspSampleValve3 = masspSampleValve3;
    }
    public int getMasspSampleValve4() {
        return masspSampleValve4;
    }

    public void setMasspSampleValve4(int masspSampleValve4) {
        this.masspSampleValve4 = masspSampleValve4;
    }
    public int getMasspGroundRelayStatus() {
        return masspGroundRelayStatus;
    }

    public void setMasspGroundRelayStatus(int masspGroundRelayStatus) {
        this.masspGroundRelayStatus = masspGroundRelayStatus;
    }
    public int getMasspExternalValve1Status() {
        return masspExternalValve1Status;
    }

    public void setMasspExternalValve1Status(int masspExternalValve1Status) {
        this.masspExternalValve1Status = masspExternalValve1Status;
    }
    public int getMasspExternalValve2Status() {
        return masspExternalValve2Status;
    }

    public void setMasspExternalValve2Status(int masspExternalValve2Status) {
        this.masspExternalValve2Status = masspExternalValve2Status;
    }
    public int getMasspExternalValve3Status() {
        return masspExternalValve3Status;
    }

    public void setMasspExternalValve3Status(int masspExternalValve3Status) {
        this.masspExternalValve3Status = masspExternalValve3Status;
    }
    public int getMasspExternalValve4Status() {
        return masspExternalValve4Status;
    }

    public void setMasspExternalValve4Status(int masspExternalValve4Status) {
        this.masspExternalValve4Status = masspExternalValve4Status;
    }
    public int getMasspCalBag1Minutes() {
        return masspCalBag1Minutes;
    }

    public void setMasspCalBag1Minutes(int masspCalBag1Minutes) {
        this.masspCalBag1Minutes = masspCalBag1Minutes;
    }
    public int getMasspCalBag2Minutes() {
        return masspCalBag2Minutes;
    }

    public void setMasspCalBag2Minutes(int masspCalBag2Minutes) {
        this.masspCalBag2Minutes = masspCalBag2Minutes;
    }
    public int getMasspCalBag3Minutes() {
        return masspCalBag3Minutes;
    }

    public void setMasspCalBag3Minutes(int masspCalBag3Minutes) {
        this.masspCalBag3Minutes = masspCalBag3Minutes;
    }
    public int getMasspNafionHeaterStatus() {
        return masspNafionHeaterStatus;
    }

    public void setMasspNafionHeaterStatus(int masspNafionHeaterStatus) {
        this.masspNafionHeaterStatus = masspNafionHeaterStatus;
    }
    public int getMasspNafionHeater1Power() {
        return masspNafionHeater1Power;
    }

    public void setMasspNafionHeater1Power(int masspNafionHeater1Power) {
        this.masspNafionHeater1Power = masspNafionHeater1Power;
    }
    public int getMasspNafionHeater2Power() {
        return masspNafionHeater2Power;
    }

    public void setMasspNafionHeater2Power(int masspNafionHeater2Power) {
        this.masspNafionHeater2Power = masspNafionHeater2Power;
    }
    public int getMasspNafionCoreTemp() {
        return masspNafionCoreTemp;
    }

    public void setMasspNafionCoreTemp(int masspNafionCoreTemp) {
        this.masspNafionCoreTemp = masspNafionCoreTemp;
    }
    public int getMasspNafionElapsedTime() {
        return masspNafionElapsedTime;
    }

    public void setMasspNafionElapsedTime(int masspNafionElapsedTime) {
        this.masspNafionElapsedTime = masspNafionElapsedTime;
    }
    public int getMasspIonChamberHeaterStatus() {
        return masspIonChamberHeaterStatus;
    }

    public void setMasspIonChamberHeaterStatus(int masspIonChamberHeaterStatus) {
        this.masspIonChamberHeaterStatus = masspIonChamberHeaterStatus;
    }
    public int getMasspIonChamberHeater1Status() {
        return masspIonChamberHeater1Status;
    }

    public void setMasspIonChamberHeater1Status(int masspIonChamberHeater1Status) {
        this.masspIonChamberHeater1Status = masspIonChamberHeater1Status;
    }
    public int getMasspIonChamberHeater2Status() {
        return masspIonChamberHeater2Status;
    }

    public void setMasspIonChamberHeater2Status(int masspIonChamberHeater2Status) {
        this.masspIonChamberHeater2Status = masspIonChamberHeater2Status;
    }

    @Override
    public String toString() {
        // TODO - generate json?
        return "";
    }
}